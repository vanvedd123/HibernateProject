package com.ServiceImpl;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import Model.Address;
import Model.HibernateUtil;
import Model.Student;

public class OperationServiceImpl implements OperationService {
Scanner sc=new Scanner(System.in);
SessionFactory sf=HibernateUtil.getSessionFactory();
	@Override
	public void insertStudentWithAddress() {
		Student s=new Student();
		Address address=new Address();
		Session session=sf.openSession();
		//int id=sc.nextInt();
		System.out.println("Enter student id");
		s.setId(sc.nextInt());
		
		System.out.println("Enter student Name");
		s.setName(sc.next());
		
		System.out.println("Enter student Email");
		s.setEmail(sc.next());
		
		System.out.println("Enter Student aid");
		address.setAid(sc.nextInt());
		
		System.out.println("Enter student City");
	    address.setCity(sc.next());
	    
	    System.out.println("Enter student Dist");
	    address.setDist(sc.next());
	   
	      System.out.println("Enter Student address");
	      s.setAddress(address);
	      
	      session.save(s);
	      session.beginTransaction().commit();
	      
	      System.out.println("insert StudentwithAddress Successfull....");
	}

	@Override
	public void ShowAllData() {
		Session session=sf.openSession();
		int id=sc.nextInt();
		Query<Student> query = session.createQuery("from Student");
		java.util.List<Student>slist=query.getResultList();
		System.out.println(slist);
		
	}

	@Override
	public void insertSingleStudentWithAddress() {
		System.out.println("Enter Student id");
		Session session=sf.openSession();
		int id=sc.nextInt();
		Student student=session.get(Student.class,id);
		if(student!=null) {
			System.out.println(student);
		}else {
			System.out.println("Student not Fount");
		}
		
		
	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateusingStudentWithAddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteStudent() {
		// TODO Auto-generated method stub
		
	}

}
