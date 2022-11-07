package com.hi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee employee=new Employee();
		employee.setId(333);
		employee.setName("Akshay");
		employee.setAddress("jamkhed");

		session.save(employee);
		session.beginTransaction().commit();
		System.out.println("data stored..");
		
	}
	

}
