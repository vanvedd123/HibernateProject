package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil1.getSessionFactory();
		
		Session session=sf.openSession();
		
		Customer co=new Customer();
		co.setcName("Akshay");
		co.setAddress("jamkhed");
		System.out.println(co);
		
		Product p=new Product();
		p.setpName("mobile");
		p.setPrize(25000);
		System.out.println(p);
		
		session.save(co);
		session.save(p);
		
		session.beginTransaction().commit();
		
	}

}
