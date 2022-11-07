package Com.Service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import Com.model.HibernateUtil1;
import Com.model.Product;

public class OperationServiceImpl implements OperationService {
	SessionFactory sf = HibernateUtil1.getSessionFactory();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addproductData() {
		Session session = sf.openSession();
		Product product = new Product();
		System.out.println("Enter Product Name");
		product.setName(sc.next());

		System.out.println("Enter Product Type");
		product.setPtype(sc.next());

		System.out.println("Enter product Price");
		product.setPrice(sc.nextDouble());

		session.save(product);
		session.beginTransaction().commit();

		System.out.println("Stored Data....");

	}

	@Override
	public void ShowAllData() {
		Session session = sf.openSession();

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);

		Root<Product> root = query.from(Product.class);
		query.select(root);
		Query<Product> query1 = session.createQuery(query);
		List<Product> plist = query1.getResultList();
		System.out.println(plist);

	}

	@Override

	public void getSingleProduct() {
		
		Session session=sf.openSession();
//		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
//		 
//		CriteriaQuery<Product>criQuery=criteriaBuilder.createQuery(Product.class);
//		Root<Product> root=criteriaBuilder.createQuery().from(Product.class);
//		       criteriaBuilder.select(root)
		System.out.println("Enter Product Id : ");
		int id = sc.nextInt();
		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();

			CriteriaQuery<Product> criteriaQuery  = builder.createQuery(Product.class);

			Root<Product> root = criteriaQuery.from(Product.class);
			criteriaQuery.select(root).where(builder.equal(root.get("id"), id));

			Query<Product> query = session.createQuery(criteriaQuery);
			Product product = query.getSingleResult();
			System.out.println(product);
		}catch (NoResultException e) {
			// TODO: handle exception
			System.out.println(new NoResultException("Procuct Not Found"));
		
		}

	}

	@Override
	public void getmultipleColumData() {
		
		Session session=sf.openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaBuilder= builder.createQuery(Object[].class);
		
		Root<Product>root=criteriaBuilder.from(Product.class);
		criteriaBuilder.multiselect(root.get("Name"),root.get("Price"));
		
		Query<Object[]>query=session.createQuery(criteriaBuilder);
		
		List<Object[]>olist=query.getResultList();
		
		for (Object[] objects : olist) {
			System.out.println("Product Name:"+objects[0]);
			System.out.println("Product price:"+objects[1]);
			
		}
	}

	@Override
	public void getSingleColumData() {
		Session session=sf.openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Product>criQuery=builder.createQuery(Product.class);
		
		
		Root<Product>root=criQuery.from(Product.class);
		criQuery.select(root.get("Name"));
		
		Query<Product>query=session.createQuery(criQuery);
		List<Product>plist=query.getResultList();
		System.out.println(plist);
	}

}
