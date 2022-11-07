package NativeQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtilNative.getSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();

		Employee employee = new Employee();
		employee.setName("Ganesh");
		employee.setAddress("Jamkhed");

		Query<Employee> query = session.getNamedNativeQuery("insert");
		query.setParameter(1, employee.getId());
		query.setParameter(2, employee.getName());
		query.setParameter(3, employee.getAddress());
		query.executeUpdate();
		 session.getTransaction().commit();
		System.out.println("Done");

		
	}

}
