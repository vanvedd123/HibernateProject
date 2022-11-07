package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test1 {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		Student student = session.get(Student.class, 1);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress());

		Student student1 = session.load(Student.class, 1);
		System.out.println(student1.getId());
		System.out.println(student1.getId());
		System.out.println(student1.getId());

		Employee e = session.get(Employee.class, 1);
		System.out.println(e.getEid());
		System.out.println(e.geteName());
		System.out.println(e.getAddrass());
		
		Employee e1=session.load(Employee.class, 1);
		System.out.println(e1.getEid());
		System.out.println(e1.geteName());
		System.out.println(e1.getAddrass());


	}

}
