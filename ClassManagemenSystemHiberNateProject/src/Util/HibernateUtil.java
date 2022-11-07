package Util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.Model.Batch;
import com.Model.Course;
import com.Model.Faculty;

public class HibernateUtil {

	private static StandardServiceRegistry regestry = null;

	private static SessionFactory sf;

	public static SessionFactory getSessionFactory() {

		if (sf == null) {
			Map<String, Object> map = new HashMap<String, Object>();

			map.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			map.put(Environment.URL, "jdbc:mysql://localhost:3306/HibernateOneToOneUniDiaractionProjectClassMngSyatem");
			map.put(Environment.USER, "root");
			map.put(Environment.PASS, "root");

			map.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			map.put(Environment.SHOW_SQL, true);
			map.put(Environment.HBM2DDL_AUTO, "update");

			regestry = new StandardServiceRegistryBuilder().applySettings(map).build();

			MetadataSources mds = new MetadataSources(regestry).addAnnotatedClass(Course.class)
					.addAnnotatedClass(Faculty.class).addAnnotatedClass(Batch.class).addAnnotatedClass(com.Model.Student.class);

			Metadata md = mds.getMetadataBuilder().build();
			sf = md.buildSessionFactory();

		}
		return sf;

}
}