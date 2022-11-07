package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 {
	public static void main(String[] args) {
		SessionFactory sf= Hibernate1.getSessionFactory();
		
		Session session=sf.openSession();
		
		Employee employee=session.get(Employee.class, 12);
		
		employee .setName("Mauli");
		employee.setAddress("nagar");
		employee.setSalary(25000);
		session.update(employee);
		session.beginTransaction().commit();
		
	}

}
