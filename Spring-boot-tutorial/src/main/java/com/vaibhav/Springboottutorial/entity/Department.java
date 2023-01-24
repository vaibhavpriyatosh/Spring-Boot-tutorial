package com.vaibhav.Springboottutorial.entity;


//import org.hibernate.validator.constraints.NotBlank;

//import org.hibernate.validator.constraints.Email;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departmentId;
	@NotBlank(message = "This should not be null")
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	
//	public Long getDepartmentId() {
//		return departmentId;
//	}
//	public void setDepartmentId(Long departmentId) {
//		this.departmentId = departmentId;
//	}
//	public String getDepartmentName() {
//		return departmentName;
//	}
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//	public String getDepartmentAddress() {
//		return departmentAddress;
//	}
//	public void setDepartmentAddress(String departmentAddress) {
//		this.departmentAddress = departmentAddress;
//	}
//	public String getDepartmentCode() {
//		return departmentCode;
//	}
//	public void setDepartmentCode(String departmentCode) {
//		this.departmentCode = departmentCode;
//	}
//	public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
//		super();
//		this.departmentId = departmentId;
//		this.departmentName = departmentName;
//		this.departmentAddress = departmentAddress;
//		this.departmentCode = departmentCode;
//	}
//	@Override
//	public String toString() {
//		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
//				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
//	}
//	public Department() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
	
}
