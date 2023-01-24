package com.vaibhav.Springboottutorial.Repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vaibhav.Springboottutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long >{

	@Query(value = "SELECT * FROM DEPARTMENT WHERE DEPARTMENT_NAME=?1",nativeQuery = true)
	public List<Department> findByDepartmentName(String departmentName);
	
}
