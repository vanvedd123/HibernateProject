package com;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test1 {
	public static void main(String[] args) {
		SessionFactory sf=Hibernate1.getSessionFactory();
		
		Session session=sf.openSession();
		
		org.hibernate.query.Query<Employee>Query=session.createQuery("from Employee");
		
		List<Employee>list=Query.getResultList();
		
		System.out.println(list);
	}

}
