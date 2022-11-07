package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		Student student =new Student();
		student.setName("Tukaram");
		student.setAddress("pune");
		
		System.out.println(student);
		
		session.save(student);
		session.beginTransaction().commit();
	}

}
