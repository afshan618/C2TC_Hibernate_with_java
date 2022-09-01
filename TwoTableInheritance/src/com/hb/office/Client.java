package com.hb.office;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Employee
		Employee emp = new Employee();
		emp.setName("Siya");
		emp.setSalary(8000);
		em.persist(emp);
		
		//Manager
		Manager mgr = new Manager();
		mgr.setName("Meera");
		mgr.setSalary(12000);
		mgr.setDepartmentName("HR");
		em.persist(mgr);
		
		em.getTransaction().commit();
		
		System.out.println("Employee and Manager is added.....");
		em.close();
		factory.close();

	}

}