package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test1 {
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Employee employee=session.get(Employee.class, 1);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
		
		System.out.println("========================================");
		Employee employee1=session.load(Employee.class, 1);
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getAddress());
		
	}

}
