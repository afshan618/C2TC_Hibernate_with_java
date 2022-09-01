package com.hb.office;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_table")
public class Manager extends Employee{
	
	public static final long serialVersionUID = 1L;
	
	private String departmentName;

	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}