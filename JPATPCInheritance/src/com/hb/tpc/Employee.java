package com.hb.tpc;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@DiscriminatorColumn(name="emplType", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Emp")
public class Employee implements Serializable{
	
	public static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int empId;
	private String name;
	private int salary;
	
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
}