package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestOne {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Customer customer=new Customer();
		customer.setCid(1234);
		customer.setCname("PQRS");
		customer.setcEmail("akshay@123gmail.com");
		
		session.saveOrUpdate(customer);
		session.beginTransaction().commit();
		System.out.println("Done");
		
	}

}
