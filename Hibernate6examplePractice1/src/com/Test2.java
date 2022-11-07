package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Employee emp=session.get(Employee.class, 1);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		
		System.out.println("==========================");
		session.evict(emp);
		System.out.println("============================");
		
		Employee employee=session.load(Employee.class, 1);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
	}

}
