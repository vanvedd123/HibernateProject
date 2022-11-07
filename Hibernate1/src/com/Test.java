package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		A1 a1=new A1();
		a1.setId(44);
		a1.setName("Danraj");
		a1.setAddress("pune");
		
		session.save(a1);
		session.beginTransaction().commit();
		System.out.println("data stored");
	}

}
