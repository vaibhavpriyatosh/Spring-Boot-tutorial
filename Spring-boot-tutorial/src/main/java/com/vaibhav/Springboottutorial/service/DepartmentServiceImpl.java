package com.vaibhav.Springboottutorial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.Springboottutorial.Error.DepartmentNotFoundException;
import com.vaibhav.Springboottutorial.Repository.DepartmentRepository;
import com.vaibhav.Springboottutorial.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		
//		System.out.println(department.toString());
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		Optional<Department> department = departmentRepository.findById(departmentId);
	
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Find");
		}
		
		return department.get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		
		departmentRepository.deleteById(departmentId);
		
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		Department depDB=fetchDepartmentById(departmentId);
		
		String dbName=department.getDepartmentName();
		String dbAddress=department.getDepartmentAddress();
		String dbCode=department.getDepartmentCode();
		
		if(Objects.nonNull(dbName) && !"".equalsIgnoreCase(dbName)) {
			depDB.setDepartmentName(dbName);
		}
		if(Objects.nonNull(dbAddress) && !"".equalsIgnoreCase(dbAddress)) {
			depDB.setDepartmentName(dbAddress);
		}
		if(Objects.nonNull(dbCode) && !"".equalsIgnoreCase(dbCode)) {
			depDB.setDepartmentName(dbCode);
		}
		return departmentRepository.save(depDB);
		
	}

	@Override
	public List<Department> fetchDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}

}
