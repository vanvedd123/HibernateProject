package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Student student=new Student();
		student.setId(11);
		student.setName("Mauli");
		student.setAddress("pune");
		
		session.save(student);
		session.beginTransaction().commit();
		System.out.println("Data stored");
	}

}