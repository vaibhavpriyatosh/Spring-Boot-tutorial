package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import entity.Department;
import repository.DepartmentRepository;

@Service
@Component
public class DepartmentServiceImpl implements DepartmentService{

	public DepartmentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
//	private DepartmentRepository departmentRepository;
//	
//	@Override
//	public Department saveDepartment(Department department) {
//		// TODO Auto-generated method stub
//		return departmentRepository.save(department);
//	}
	
	

}
