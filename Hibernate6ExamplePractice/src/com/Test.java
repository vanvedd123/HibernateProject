package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		student s=new student();
		s.setName("akshay");
		s.setAddress("Jamkhed");
		
		System.out.println(s);
		
		session.save(s);
		session.beginTransaction().commit();
		
	}

}

