package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=Hibernate1.getSessionFactory();
		Session session=sf.openSession();
		Employee employee=new Employee();
		employee.setEid(21);
		employee.setName("Lakhan");
		employee.setAddress("Pune");
		employee.setSalary(35000);
		
		session.save(employee);
		session.beginTransaction().commit();
		
		System.out.println("stored Data");
		
		
	}

}
