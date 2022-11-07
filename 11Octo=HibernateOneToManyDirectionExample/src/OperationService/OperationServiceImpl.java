package OperationService;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import Model.HibernateUtil;
import Model.Product;
import Model.User;

public class OperationServiceImpl implements OperationService {
	Scanner sc = new Scanner(System.in);
	SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public void addUserDataWithMultipleProduct() {
		Session session = sf.openSession();
		User u = new User();

		System.out.println("Enter User name");
		u.setUName(sc.next());

		System.out.println("Enter user Address");
		u.setAddress(sc.next());

		System.out.println("How many Product bying");

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Product p = new Product();

			System.out.println("Enter Product name");
			p.setpName(sc.next());

			System.out.println("Enter Product Price");
			p.setPrice(sc.nextLong());

			u.getPlist().add(p);

		}
		session.save(u);
		session.beginTransaction().commit();
		System.out.println("Data Stored..");

	}

	@Override
	public void showAllUserWithMultipleProductData() {
		Session session = sf.openSession();

		Query<User> query = session.createQuery("from User");
		List<User> ulist = query.getResultList();

		for (User u : ulist) {
			System.out.println(u);
		}

	}

	@Override
	public void getSingleUserWithMultipleProductData() {
		System.out.println("Enter User Id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		User user = session.get(User.class, id);
		System.out.println(user);

	}

	@Override
	public void updateUser() {
		Session session = sf.openSession();
		System.out.println("Enter user id");
		int id = sc.nextInt();

		User user = session.get(User.class, id);
		if (user != null) {
			System.out.println("Enter user name");
			user.setUName(sc.next());

			System.out.println("Enter User Address");
			user.setAddress(sc.next());

			session.update(user);
			session.beginTransaction().commit();

			System.out.println("Data Stored");
		}

	}

	@Override
	public void updatePerticularProductDataUsingUserId() {
		Session session = sf.openSession();
		System.out.println("Enter User id");
		int id = sc.nextInt();

		User user = session.get(User.class, id);
		System.out.println(user);

		List<Product> plist = user.getPlist();
		System.out.println("Enter Product id");
		int pid=sc.nextInt();
		
		for (Product p : plist) {
			if (p.getId() == pid) {
				System.out.println("Enter p name");
				p.setpName(sc.next());

				System.out.println("Enter P price");
				p.setPrice(sc.nextLong());

			}
		}

		session.update(user);
		session.beginTransaction().commit();
		System.out.println("update Successfully....");

	}

	@Override
	public void deletePerticularProductDataUsingUserId() {
		System.out.println("Enter User id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		User user = session.get(User.class, id);
		if(user!=null) {
		List<Product> plist = user.getPlist();
		System.out.println("Enter Product id");
		int pid = sc.nextInt();
 
		for (Product p : plist) {

			if (p != null && (p.getId() == pid)) {
				plist.remove(p);
				session.delete(p);
				session.beginTransaction().commit();
				break;
			} else {
				System.out.println("Product not found");
			}
		}
			
		}else {
			System.out.println("User not found...");
			deletePerticularProductDataUsingUserId();
			
		}

	}

	@Override
	public void deleteUser() {
		System.out.println("Enter user id");
		Session session=sf.openSession();
		int id=sc.nextInt();
		User user=session.get(User.class, id);
		if(user!=null) {
			session.delete(user);
			session.beginTransaction().commit();
			
		}else {
			System.out.println("User not found");
			
		}
			}

	@Override
	public void addProductDataToExistingUser() {
		
		Session session=sf.openSession();
		
		System.out.println("Enter user id");
		int id=sc.nextInt();
		User user=session.get(User.class, id);
		if(user!=null) {
			Product p=new Product();
			System.out.println("Enter Product Name");
			p.setpName(sc.next());
			
			System.out.println("Enter Product price");
			p.setPrice(sc.nextLong());
			
			user.getPlist().add(p);
			session.save(p);
			session.beginTransaction().commit();
			System.out.println("addProductDataToExistingUser successfully..");
			
		}else {
			System.out.println("User not Found");
			addProductDataToExistingUser();
		}
		
		
		
	}

}
