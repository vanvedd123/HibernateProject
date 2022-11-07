package com.Service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.Model.Batch;
import com.Model.Course;
import com.Model.Faculty;
import com.Model.Student;

import Util.HibernateUtil;

public class OperationServiceImpl implements OperationService {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {

		Session session = sf.openSession();
		Course c=new Course();
		System.out.println("Enter Course Name");
		c.setName(sc.next());
		
		session.save(c);
		session.beginTransaction().commit();
		System.out.println("Course added Successfully....");

	}

	@Override
	public void displayCourse() {
		Session session=sf.openSession();
		Query<Course>query=session.createQuery("from Course");
		List<Course>clist=query.getResultList();
		for (Course course : clist) {
		
			System.out.println(clist);
		}
	}

	@Override
	public void addFacalty() {
		Session session=sf.openSession();
		Faculty faculty=new Faculty();
		Course course=new Course();
		
		System.out.println("Enter Faculty Name");
		faculty.setfName(sc.next());
		System.out.println("Enter Course id ");
		int id=sc.nextInt();
		Course course2=session.get(Course.class, id);
		
		if(course2!=null) {
			faculty.setCourse(course2);
			session.save(faculty);
			session.beginTransaction().commit();
			
			System.out.println("Faculty added Successfully.....");
		}else {
			System.out.println("Course not found...");
		}
		
			}

	@Override
	public void displayFacalty() {
		Session session=sf.openSession();
				
		Query<Faculty>query=session.createQuery("from Faculty");
		List<Faculty>flist=query.getResultList();
		for (Faculty faculty : flist) {
			System.out.println(flist);
		}
	}

	@Override
	public void AddBatch() {
		Session session=sf.openSession();
		Batch batch=new Batch();
		Faculty faculty=new Faculty();
		System.out.println("Enter Batch Name");
		batch.setbName(sc.next());
		
		System.out.println("Enter Faculty fid");
		int id=sc.nextInt();
		Faculty faculty2=session.get(Faculty.class, id);
		if(faculty2!=null) {
			batch.setFaculty(faculty2);
			session.save(batch);
			session.beginTransaction().commit();
			
			System.out.println("Batch Added Successfully.....");
		}else {
			System.out.println("Faculty not found.....");
		}
		
	}

	@Override
	public void DisplayBatch() {
		Session session=sf.openSession();
		
		Query<Batch>query=session.createQuery("from Batch");
		List<Batch>blist=query.getResultList();
		for (Batch batch : blist) {
			System.out.println(blist);
			
		}
	}

	@Override
	public void AddStudent() {
		Session session=sf.openSession();
		Student student=new Student();
		Batch batch=new Batch();
		
		System.out.println("Enter Student Name");
		student.setsName(sc.next());
		
		System.out.println("Enter Batch bid");
		int id=sc.nextInt();
		
		Batch batch2=session.get(Batch.class, id);
		if(batch2!=null) {
			student.setBatch(batch2);
			session.save(student);
			session.beginTransaction().commit();
			
			System.out.println("Student added Successfully....");
			
		}else {
			System.out.println("Batch Not Found...");
		}
		
	}

	@Override
	public void DisplayStudent() {
		Session session=sf.openSession();
	
		Query<Student>query=session.createQuery("from Student");
		List<Student>slist=query.getResultList();
		for (Student student : slist) {
			System.out.println(slist);
			
		}
	}

}
