package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		
		SessionFactory  sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Employee employee=new Employee();
		employee.setName("Rahul");
		employee.setAddress("dhule");
		
		System.out.println(employee);
		
		session.save(employee);
		session.beginTransaction().commit();
	}

}
