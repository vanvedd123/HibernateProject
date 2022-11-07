package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee e=new Employee();
		e.setEid(11);
		e.seteName("Tushar");
		e.setAddress("Nagar");
		
		session.save(e);
		session.beginTransaction().commit();
		System.out.println("Data stored");
	}

}
