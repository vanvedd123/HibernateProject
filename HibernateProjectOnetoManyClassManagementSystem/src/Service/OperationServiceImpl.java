package Service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import Model.Batch;
import Model.Course;
import Model.Faculty;
import Model.Student;
import Util.HibernateUtil;

public class OperationServiceImpl implements OperationService {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addCoursewithMultipleFaculty() {
		Course course=new Course();
		Session session=sf.openSession();
		System.out.println("Enter Course Name");
		course.setcName(sc.next());
		System.out.println("how many faculties you want to add to this perticular Course:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			Faculty faculty=new Faculty();
			
			System.out.println("Enter Faculty Name");
			faculty.setfName(sc.next());
			
			course.getFlist().add(faculty);
		}
		session.save(course);
		session.beginTransaction().commit();
		
		
	}
	@Override
	public void showAllCoursemultipleFaculty() {
		Session session=sf.openSession();
		Course course=new Course();
		Query<Course>query=session.createQuery("from Course");
		List<Course>clist=query.getResultList();
		for (Course course2 : clist) {
			System.out.println(clist);
			
		}
		
		
	}
	@Override
	public void getSingleCoursewithMultipleFaculty() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Course course=new Course();
		
		System.out.println("Enter Course id:");
		int id=sc.nextInt();
		Course course2=session.get(Course.class, id);
		
		if(course2!=null) {
			System.out.println(course2);
		}else {
			System.out.println("you Entered Invlid course id......");
		}
		
		
	}
	@Override
	public void addFacultyToperticularCourse() {
		Faculty faculty=new Faculty();
		Session session=sf.openSession();
		
		System.out.println("Enter Course id You where u want to add:");
		int cid=sc.nextInt();
		
		Course course2=session.get(Course.class, cid);
		
		if(course2!=null) {
			
			System.out.println("Enter Faculty Name");
			faculty.setfName(sc.next());
			
			course2.getFlist().add(faculty);
			session.save(course2);
			session.beginTransaction().commit();
			System.out.println("Faculty added Successfully....");
		}else {
			System.out.println("Please Enter Your valid Course id......");
			addFacultyToperticularCourse();
		}
		
	}
	@Override
	public void showAllFaculties() {
		Session session=sf.openSession();
		
		Query<Faculty>query=session.createQuery("from Faculty");
		List<Faculty>flist=query.getResultList();
		for (Faculty faculty : flist) {
			System.out.println(flist);
		}
		
	}
	@Override
	public void addBatchwithMultipleStudent() {
		Session session=sf.openSession();
		Batch batch=new Batch();
		System.out.println("Enter Batch Name");
		batch.setbName(sc.next());
		
		System.out.println("Enter Haw many Student add this Perticular Batch");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			Student student=new Student();
			
			System.out.println("Enter Student name");
			student.setsName(sc.next());
			
			batch.getSlist().add(student);
		}
			session.save(batch);
			session.beginTransaction().commit();
			
			System.out.println("Batch Added Successfully...");
		
         		
	}
	@Override
	public void singleBatchwithMultipleStudent() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Batch batch=new Batch();
		System.out.println("Enter Batch id");
		int bid=sc.nextInt();
		Batch batch1=session.get(Batch.class, bid);
		if(batch1!=null) {
			System.out.println(batch1);
		}else {
			System.out.println("Batch not found...");
			singleBatchwithMultipleStudent();

		}
		
	}
	@Override
	public void ShowAllBatchwithMultipleStudent() {
		Session session=sf.openSession();
		Query<Batch>query=session.createQuery("from Batch");
		List<Batch>blist=query.getResultList();
		for (Batch batch : blist) {
			System.out.println(blist);
		}
		
	}
	
	@Override
	public void addStudentToperticularBatch() {
		Student student=new Student();
		Session session=sf.openSession();
		System.out.println("Enter Batch id where want to u add:");
		int id=sc.nextInt();
		Batch batch=session.get(Batch.class, id);
		if(batch!=null) {
			
			System.out.println("Enter Student name");
			student.setsName(sc.next());
			
			batch.getSlist().add(student);
			session.save(batch);
			session.beginTransaction().commit();
			System.out.println("Added batch Successfully...");
		}else {
			System.out.println("Enter your Valid Batch id....");
			addStudentToperticularBatch();
		}
		
	}
	@Override
	public void showAllStudent() {
		Session session=sf.openSession();
		
		Query<Student>query=session.createQuery("from Student");
		List<Student>slist=query.getResultList();
		for (Student student : slist) {
			System.out.println(slist);
			
		}
		
	}

}