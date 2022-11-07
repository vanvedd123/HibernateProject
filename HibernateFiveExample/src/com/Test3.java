package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test3 {
	public static void main(String[] args) {
		SessionFactory sf=Hibernate1.getSessionFactory();
		Session session=sf.openSession();
		
		Employee e=session.get(Employee.class, 222);
		
		session.delete(e);
		session.beginTransaction().commit();
	}

}
