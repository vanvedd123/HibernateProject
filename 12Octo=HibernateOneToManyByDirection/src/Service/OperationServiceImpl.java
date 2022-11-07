package Service;

import java.util.List;
import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import Model.Student;
import Model.Subject;
import Util.HibernateUti1l;

public class OperationServiceImpl implements OpretionService {
	SessionFactory sf=HibernateUti1l.getSessionFactory();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addStudentWithMultipleSubject() {
		Session session=sf.openSession();
		Student s=new Student();
		System.out.println("Enter Student Name");
		s.setsName(sc.next());
		System.out.println("How many sub Regester by Student...");
		int n=sc.nextInt();
		for(int i=0;i< n;i++) {
			

		Subject subject=new Subject();
			System.out.println("Enter Subject Name");
			subject.setSub_Name(sc.next());
			
			subject.setStudent(s);
			
			session.save(s);
			session.save(subject);
		}
		session.beginTransaction().commit();
	}
	

	@Override
	public void showAllStudentDataWithMultipleSubject() {
		Session session=sf.openSession();
		Query<Student>query=session.createQuery("from Student");
		List<Student>sublist=query.getResultList();
		for(Student s:sublist) {
			System.out.println(s);
			
		}
		
	}

	@Override
	public void getSingeStudentWithMultipleSubject() {
		System.out.println("Enter Student id");
		Session session=sf.openSession();
		int id=sc.nextInt();
		Student student=session.get(Student.class, id);
		if(student!=null) {
			System.out.println(student);
			
		}else {
			System.out.println("student not found");
		}
	}

	@Override
	public void updateStudent() {
		Session session=sf.openSession();
		System.out.println("Enter Student id");
		int id=sc.nextInt();
		Student student=session.get(Student.class, id);
		if(student!=null) {
			System.out.println("Enter Student Name");
			student.setsName(sc.next());
			
			session.update(student);
			session.beginTransaction().commit();
			
		}else {
			System.out.println("Student not found");
		}
		
	}

	@Override
	public void updatePerticularSubjectusingStudentId() {
		Session session=sf.openSession();
		System.out.println("Enter Student id");
		int id=sc.nextInt();
		Student student=session.get(Student.class, id);
		if(student!=null) {
			List<Subject>sublist=student.getSlist();
			System.out.println("Enter Subject id");
			int id1=sc.nextInt();
			for (Subject subject : sublist) {
				if(sublist!=null&&subject.getSub_id()==id1) {
					System.out.println("Enter Subject name");
					subject.setSub_Name(sc.next());
				}
				}
			session.update(sublist);
			session.beginTransaction().commit();
			System.out.println("update successfully");
				
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

	@Override
	public void addMultipleSubjectToSingleStudent() {
		Session session=sf.openSession();
		System.out.println("Enter Student id");
		int id=sc.nextInt();
		Student student=session.get(Student.class, id);
		if(student!=null) {
			List<Subject>sublist=student.getSlist();
			System.out.println("Enter How many Subject Want To add: ");

			for (Subject subject : sublist) {
				int n = sc.nextInt();
				
				for(int i =1; i<=n; i++) {
				System.out.println("Enter Subject Name: ");	
				subject.setSub_Name(sc.next());
				session.save(subject);
				
				}
				session.beginTransaction().commit();
				System.out.println("Add Subject Successfully");
				
			}
			
			
		}
	}

	@Override
	public void showAllSubjectWithStudentData() {
		Session session=sf.openSession();
		Query<Subject>query=session.createQuery("from Subject");
		List<Subject>sublist=query.getResultList();
		for (Subject subject : sublist) {
			System.out.println(sublist);
			
		}
	}

	@Override
	public void getSingleSubjectWithStudentData() {
		Session session=sf.openSession();
		System.out.println("Enter Subject id");
		int id=sc.nextInt();
		Subject subject=session.get(Subject.class, id);
		if(subject!=null) {
			System.out.println(subject);
		}else {
			System.out.println("Subject not found");
			getSingleSubjectWithStudentData();
		}
	}

	@Override
	public void updateSubject() {
		Session session=sf.openSession();
		System.out.println("Enter subject id");
		int id=sc.nextInt();
		Subject subject=session.get(Subject.class, id);
		if(subject!=null) {
			System.out.println("Enter subject name");
			subject.setSub_Name(sc.next());
    session.update(subject);
    session.beginTransaction().commit();
		}else {
			System.out.println("subject not found");
			updateSubject();
		}
		
		
	}

	@Override
	public void updateStudentUsingSubject() {
		
		
	}
	

}
