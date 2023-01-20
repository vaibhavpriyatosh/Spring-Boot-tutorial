package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Department {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	private String deoartmentName;
	private String deoartmentAddress;
	private String deoartmentCode;
	
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", deoartmentName=" + deoartmentName
				+ ", deoartmentAddress=" + deoartmentAddress + ", deoartmentCode=" + deoartmentCode + "]";
	}
	public Department(long departmentId, String deoartmentName, String deoartmentAddress, String deoartmentCode) {
		super();
		this.departmentId = departmentId;
		this.deoartmentName = deoartmentName;
		this.deoartmentAddress = deoartmentAddress;
		this.deoartmentCode = deoartmentCode;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeoartmentName() {
		return deoartmentName;
	}
	public void setDeoartmentName(String deoartmentName) {
		this.deoartmentName = deoartmentName;
	}
	public String getDeoartmentAddress() {
		return deoartmentAddress;
	}
	public void setDeoartmentAddress(String deoartmentAddress) {
		this.deoartmentAddress = deoartmentAddress;
	}
	public String getDeoartmentCode() {
		return deoartmentCode;
	}
	public void setDeoartmentCode(String deoartmentCode) {
		this.deoartmentCode = deoartmentCode;
	}
	
}
