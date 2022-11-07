package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		// first level csche from check(i e student)
		student s = session.get(student.class, 1);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress());

		System.out.println("==================================");
		session.evict(s);
		System.out.println("===================================");
		student s1 = session.load(student.class, 2);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());

	}

}
