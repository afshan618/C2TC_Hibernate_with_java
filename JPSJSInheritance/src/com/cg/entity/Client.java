package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee(); //Employee Class Object
		employee.setName("Riya Mishra");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();  //Manager Class Object
		manager.setName("Aditi");
		manager.setSalary(12000);
		manager.setDepartmentName("C2C");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database");
		em.close();
		factory.close();
	}

}