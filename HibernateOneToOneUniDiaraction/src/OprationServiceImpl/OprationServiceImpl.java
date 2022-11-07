package OprationServiceImpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.Address;
import Model.HibernateUtil;
import Model.Student;
import OperationService.OprationService;

public class OprationServiceImpl implements OprationService{
Scanner sc=new Scanner(System.in);
SessionFactory sf=HibernateUtil.getSessionFactory();
	@Override
	public void insertStudentWithAddress() {
		//SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Student s=new Student();
		Address a1=new Address();
		
		System.out.println("Enter Student id");
		s.setId(sc.nextInt());
		
		System.out.println("Enter student name");
		s.setuName(sc.next());
		
		System.out.println("Enter Student Email");
		s.setuEmail(sc.next());
		
		System.out.println("Enter Student Pass");
		s.setPass(sc.nextInt());
		
		System.out.println("Enter Student City");
		a1.setCity(sc.next());
		
		System.out.println("Enter Student Dist");
		a1.setDist(sc.next());
		
		System.out.println("Enter student Address");
		s.setAddress(a1);
		
		session.save(s);
		session.beginTransaction().commit();
	
		System.out.println("insert studentwithaddress Successfully");
		
		
	}

	@Override
	public void showallData() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Student> query=session.createQuery("from Person");
		List<Student>slist=query.getResultList();
		System.out.println(slist);
	}

	@Override
	public void insertSingleStudentWithAddress() {
		System.out.println("Enter Student id");
		Session session=sf.openSession();
		int n=sc.nextInt();
		Student student=session.get(Student.class, n);
		
		if(student!=null) {
			System.out.println(student);
			
		}else {
			System.out.println("Student not found");
		}
		
	}

	@Override
	public void UpdateStudent() {
		Session session=sf.openSession();
		
		System.out.println("Enter Student id");
		
		int id=sc.nextInt();
		Student student=session.get(Student.class, id);
		
		if(student!=null) {
			System.out.println("Enter student name");
			student.setuName(sc.next());
			
			System.out.println("Enter Student Email");
			student.setuEmail(sc.next());
			
			System.out.println("Enter Student Pass");
			student.setPass(sc.nextInt());
			
			session.update(student);
			session.beginTransaction().commit();
			
		}else {
			System.out.println("Student not found");
			
		}
		
	}

	@Override
	public void updateAddressUsingStudent() {
		Session session=sf.openSession();
		System.out.println("Enter student id");
		int id=sc.nextInt();
		Student student=session.get(Student.class,id);
		if(student!=null) {
		Address address	=student.getAddress();
		if(address!=null) {
			System.out.println("Enter Student City");
			address.setCity(sc.next());
			
			System.out.println("Enter Student Dist");
			address.setDist(sc.next());
			
			session.update(student);
			session.beginTransaction().commit();
			
			
		}else {
			System.out.println("Address not found");
		}
		}else {
			System.out.println("Student not found");
			
		}
		
		}
	

	@Override
	public void deleteStudent() {
		Session session=sf.openSession();
		System.out.println("Enter Student id");
		int id=sc.nextInt();
		Student student=session.get(Student.class, id);
		if(student!=null) {
			session.delete(student);
			session.beginTransaction().commit();
		}else {
			System.out.println("Student not found");
		}
	}



	
		
	}


