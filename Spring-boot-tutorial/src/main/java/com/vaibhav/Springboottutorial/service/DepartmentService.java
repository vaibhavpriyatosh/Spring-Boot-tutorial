package com.vaibhav.Springboottutorial.service;

import java.util.List;

import com.vaibhav.Springboottutorial.Error.DepartmentNotFoundException;
import com.vaibhav.Springboottutorial.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartment();

	Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	void deleteDepartmentById(Long departmentId);

	Department updateDepartment(Long departmentId, Department department) throws DepartmentNotFoundException;

	List<Department> fetchDepartmentByName(String departmentName);

	
}
