package NamedQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
	
	public static void main(String[] args) {
		
	SessionFactory sf=HibernateUtil1.getSessionFactory();
		
	Session session=sf.openSession();
//		
//		Student student=new Student();
//		student.setName("Prathmesh");
//		student.setAddress("Tuljapur");
//		
//		session.save(student);
//		session.beginTransaction().commit();
	
	Query<Student>query=session.createNamedQuery("allData");
	List<Student>slist=query.getResultList();
	System.out.println(slist);
	
//	Query<Student>query1=session.createNamedQuery("SingleData");
//	query1.setParameter("id1", 2);
//	Student student=query1.getSingleResult();
//	System.out.println(student);
		
	Session session2= sf.openSession();
	session2.beginTransaction();
	Query<Student>query2=session2.createNamedQuery("updateData");
	query2.setParameter("n", "Mauli");
	query2.setParameter("a", "Nagar");
	query2.setParameter("i", 2);
	query2.executeUpdate();
	session2.getTransaction().commit();
	
	session.beginTransaction();
	Query<Student>query3=session.createNamedQuery("deleteData");
	query3.setParameter("id2",1);
	query3.executeUpdate();
	session.getTransaction();
	
	}

}
