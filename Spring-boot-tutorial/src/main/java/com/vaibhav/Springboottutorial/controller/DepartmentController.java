package com.vaibhav.Springboottutorial.controller;

import java.util.List;
//import java.util.logging.Logger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.Springboottutorial.Error.DepartmentNotFoundException;
import com.vaibhav.Springboottutorial.entity.Department;
import com.vaibhav.Springboottutorial.service.DepartmentService;

import jakarta.validation.Valid;

@RestController 
public class DepartmentController {

	
	@Autowired
	private DepartmentService departmentService;
	
	private final Logger Logger=org.slf4j.LoggerFactory.getLogger(Department.class);
	
	
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department){
		Logger.info("Inside saveDepartment in DepartmentController");
		System.out.println(department.toString());
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartment(){
		Logger.info("Inside fetchDepartment in DepartmentController");
		return departmentService.fetchDepartment();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDeparmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
		Logger.info("Inside fetchDeparmentById in DepartmentController");
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id")Long departmentId) {
		Logger.info("Inside deleteDepartmentById in DepartmentController");
		departmentService.deleteDepartmentById(departmentId);
		return "Deletion Successful";
		
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId,@Valid @RequestBody Department department) throws DepartmentNotFoundException {
		Logger.info("Inside updateDepartment in DepartmentController");
		return departmentService.updateDepartment(departmentId,department);
	}
	
	@GetMapping("/departments/name/{name}")
	public List<Department> fetchDepartmentByName(@PathVariable("name") String departmentName) {
		Logger.info("Inside fetchDepartmentByName in DepartmentController");
		return departmentService.fetchDepartmentByName(departmentName);
	}
	
	
}
