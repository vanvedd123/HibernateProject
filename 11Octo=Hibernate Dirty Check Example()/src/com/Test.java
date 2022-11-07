package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

//		Product p = new Product();
//		System.out.println("Enter product name");
//		p.setName(sc.next());
//		
//		System.out.println("Enter Product Price");
//		p.setPrice(sc.nextLong());
//		
//		System.out.println("Enter product type ");
//		p.setType(sc.next());
//		
//		session.save(p);
//		session.beginTransaction().commit();
		Product p1 = session.get(Product.class, 1);
		System.out.println("Enter product name");
		p1.setName(sc.next());

		session.update(p1);
		session.beginTransaction().commit();

	}

}
