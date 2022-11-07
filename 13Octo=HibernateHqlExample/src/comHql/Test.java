package comHql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
public static void main(String[] args) {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session=sf.openSession();
	
//	Employee employee=new Employee();
//	employee.setName("Babu");
//	employee.setAddress("Ashti");
//	employee.setSalary(45000.0);
//	
//	session.persist(employee);
//	session.beginTransaction().commit();
//	
	//Select* from Employee
	Query<Employee> query = session.createQuery("from Employee");
	List<Employee> elist = query.getResultList();
	
	System.out.println(elist);
	System.out.println("--------------------------------------------------------");
	
	//select * from Employee where id=?;
	Query<Employee>query2= session.createQuery("from Employee where id=:id1");
	query2.setParameter("id1",1);
	Employee employee=query2.getSingleResult();
	System.out.println(employee);

	// update Employee set name=?,Address=?,Salary=? where id=?;
	Session session2 =  sf.openSession();
	session2.beginTransaction();
	Query<Employee> query3 = session2.createQuery("update from Employee set name=:n,address=:a,salary=:s where id=:i");
    query3.setParameter("a", "Mumbai");
    query3.setParameter("n", "Dnyaneshwar");
    query3.setParameter("s", 30000.0);
    query3.setParameter("i", 2);
    
    query3.executeUpdate();
    session2.getTransaction().commit();
    
    
    session2.beginTransaction();
    //detete from Employee where id=?
    Query<Employee>query4=session2.createQuery("delete from Employee where id=:id1");
    query4.setParameter("id1",3);
    query4.executeUpdate();
    
    System.out.println("===========HQL Agragation Fuction========================");
    Query<Long> query5 = session2.createQuery("select count(*) from Employee");
    Long i = query5.getSingleResult();
    System.out.println("Employee Count : "  + i);
    
    Query<Double>query6=session2.createQuery("select max(Salary) from Employee");
    Double maxSalary=query6.getSingleResult();
    System.out.println("maximum salary:"+maxSalary);
    
    Query<Double>query7=session2.createQuery("select min(Salary)from Employee");
    Double minSalary=query7.getSingleResult();
    System.out.println("Minimum Salary:"+minSalary);
    
   
    Query<Double> query8 =  session2.createQuery("select sum(Salary) from Employee");
    Double sumSalary = query8.getSingleResult();
    System.out.println("Salary Sum : " +  sumSalary);
    

    
}
}

