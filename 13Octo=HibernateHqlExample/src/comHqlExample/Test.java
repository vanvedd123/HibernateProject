package comHqlExample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil1.getSessionFactory();

		Session session = sf.openSession();

//		Employee employee=new Employee();
//		employee.setName("Akash");
//		employee.setAddress("Latur");
//		employee.setSalary(10000.0);
//		
//		session.save(employee);
//		session.beginTransaction().commit();

		// Select * from Employee;

		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> elist = query.getResultList();
		System.out.println(elist);

		// select * from Employee where id=?;
		Query<Employee> query1 = session.createQuery("from Employee where id=:id1");
		query1.setParameter("id1", 1);

		Employee employee = query1.getSingleResult();
		System.out.println(employee);

		// update Employee set name=?,Address=?,Salary=?where id=?
		Session session2 = sf.openSession();
		session2.beginTransaction();
		Query<Employee> query3 = session2.createQuery("update from Employee set name=:n,Address=:a,Salary=:s where id=:i");
		query3.setParameter("a", "Mumbai");
		query3.setParameter("n", "Prathmesh");
		query3.setParameter("s", 23000.0);
		query3.setParameter("i", 1);
        
		query3.executeUpdate();
		session2.getTransaction().commit();;
		
	session2.beginTransaction();
		// delete from Employee where id=?
		Query<Employee>query4=session2.createQuery("delete from Employee where id=:id1");
		query4.setParameter("id1", 5);
	    query4.executeUpdate();
		
	    System.out.println("==============HQL Agregation Function==================");
	    
	    //select count(*) from Employee;
	    Query<Long>query5=session2.createQuery("select count(*)from Employee");
	    Long i=query5.getSingleResult();
	    System.out.println("Employee count:"+i);
	    
	    //
		Query<Double>query6=session2.createQuery("select max(Salary)from Employee");
		Double maxSalary=query6.getSingleResult();
		System.out.println("Maximum Salary:"+maxSalary);
		
		Query<Double>query7=session2.createQuery("select min(Salary)from Employee");
		Double minSalary=query7.getSingleResult();
		System.out.println("Minimum Salary:"+minSalary);
		
		Query<Double>query8=session2.createQuery("select sum(Salary)from Employee");
		Double sumSalary=query8.getSingleResult();
		System.out.println("Sum Salary:"+sumSalary);
		
		
		
	}

}
