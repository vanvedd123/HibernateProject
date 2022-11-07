package Com.OpretionService;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Com.Model.HibernateUtil;
import Com.Model.Product;
import Com.Model.User;

public class OperationServiceImpl implements OperationService{
	SessionFactory sf= HibernateUtil.getSessionFactory();
	Scanner sc=new Scanner(System.in);

	@Override
	public void addproductlist() {
		Session session=sf.openSession();
		User user =new User();
		
		
		System.out.println("how many Prodct you want to add");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			Product p=new Product();
			System.out.println("Enter Product Name");
			p.setName(sc.next());
			
			System.out.println("Enter Product Type");
			p.setPtype(sc.next());
			
			System.out.println("Enter Product Price");
			p.setPrice(sc.nextDouble());
			
			user.getProduct_list().add(p);
			
			session.save(p);
		}
		session.beginTransaction().commit();
		System.out.println("Product add Successfully.......");
		
	}

	@Override
	public void productSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void priceSurch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void productregister() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Productorder() {
		// TODO Auto-generated method stub
		
	}

}
