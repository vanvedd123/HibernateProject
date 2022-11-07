package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Student student=new Student();
		student.setName("Prathmesh");
		student.setAddress("pune");
		
		Employee employee=new Employee();
		employee.seteName("Dhanaraj");
		employee.setAddrass("Nagar");
		
		session.save(student);
		session.save(employee);
		
		session.beginTransaction().commit();
	}

}
