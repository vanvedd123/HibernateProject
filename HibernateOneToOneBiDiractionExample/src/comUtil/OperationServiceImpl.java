package comUtil;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import Model.AdharCard;
import Model.Person;

public class OperationServiceImpl implements OperationService {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);

	public static void userInputMethod() {
		Scanner sc = new Scanner(System.in);

		try {
			int userInput = sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
			int a = 222;
			System.out.println(a);
		}
	}

	@Override
	public void addPersonWithAdharCard() {
		Session session = sf.openSession();
		Person p1 = new Person();
		AdharCard a1 = new AdharCard();
		// int id=sc.nextInt();
		// Person p1= session.get(Person.class, id);

		System.out.println("Enter Person Name");
		p1.setpName(sc.next());

		System.out.println("Enter person Address");
		p1.setpAddress(sc.next());

		System.out.println("Enter Adhar Name");
		a1.setaName(sc.next());

		System.out.println("Enter Adhar Number");
		a1.setaNumber(sc.next());

		System.out.println("Enter Adhar Person");
		a1.setPerson(p1);

		p1.setAadharCard(a1);
		a1.setPerson(p1);

		session.save(p1);
		session.save(a1);
		session.beginTransaction().commit();

		System.out.println("addPersonWithAdharCard is Successfully...");
	}

	@Override
	public void getAllPersonwithAdharData() {

		Session session = sf.openSession();
		Query<Person> query = session.createQuery("from Person");
		java.util.List<Person> plist = query.getResultList();
		for (Person person : plist) {

			System.out.println(person.getPid() + " " + person.getpName() + " " + person.getpAddress());
			System.out.println(person.getAadharCard().getAid() + " " + person.getAadharCard().getaName() + " "
					+ person.getAadharCard().getaNumber());

		}

	}

	@Override
	public void addSinglePersonwithAdharData() {
		System.out.println("Enter person id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		if (person != null) {
			System.out.println(person);
		} else {
			System.out.println("person not found");
		}
	}

	@Override
	public void UpdatePerson() {
		System.out.println("Enter Person id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		Person p = session.get(Person.class, id);
		if (p != null) {
			System.out.println("Enter pName");
			p.setpName(sc.next());

			System.out.println("Enter Person Address");
			p.setpAddress(sc.next());

			session.update(p);
			session.beginTransaction().commit();
			System.out.println("update person Seccessfully..");

		} else {
			System.out.println("person not fount");
		}
	}

	@Override
	public void updateAdharwithPersonid() {
		System.out.println("Enter person id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		if (person != null) {
			AdharCard a = person.getAadharCard();
			if (a != null) {
				System.out.println("Enter Adhar name");
				a.setaName(sc.next());
				System.out.println("Entar Adhar Number");
				a.setaNumber(sc.next());

				session.update(a);
				session.beginTransaction().commit();
			} else {
				System.out.println("Adhar card id not found");
			}

		} else {
			System.out.println("Person not found");
		}

	}

	@Override
	public void addAdharwithPersonid() {
		Session session = sf.openSession();
		AdharCard a = new AdharCard();
		System.out.println("Enter Adhar Name");
		a.setaName(sc.next());

		System.out.println("Enter Adhar Number");
		a.setaNumber(sc.next());
		Person p = new Person();
		System.out.println("Enter Person name");
		p.setpName(sc.next());

		System.out.println("Enter Person Address");
		p.setpAddress(sc.next());

		a.setPerson(p);
		p.setAadharCard(a);

		session.save(a);
		session.beginTransaction().commit();

		System.out.println("addAdharwithPersonid successfully....");

	}

	@Override
	public void getAllAdharDatawithPersonData() {
		Session session = sf.openSession();
		Query<AdharCard> query = session.createQuery("from AdharCard");
		java.util.List<AdharCard> alist = query.getResultList();
		System.out.println(alist);
		for (AdharCard adhar : alist) {
			System.out.println(adhar.getAid() + "" + adhar.getaName() + "" + adhar.getaNumber());
			System.out.println(adhar.getPerson().getPid() + "" + adhar.getPerson().getpName() + ""
					+ adhar.getPerson().getpAddress());
		}
	}

	@Override
	public void getSingleAdharDatawithPerson() {
		System.out.println("Enter Adhar id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		AdharCard adhar = session.get(AdharCard.class, id);
		if (adhar != null) {
			System.out.println(adhar);
		} else {
			System.out.println("Adhar not fount");
		}

	}

	@Override
	public void updatePersonUsingAdharData() {
		System.out.println("Enter Person id");
		Session session = sf.openSession();
		int id = sc.nextInt();
		AdharCard adhar = session.get(AdharCard.class, id);
		if (adhar != null) {

			Person p = adhar.getPerson();
			if (p != null) {

				System.out.println("Enter person name");
				p.setpName(sc.next());

				System.out.println("Enter Person Address");
				p.setpAddress(sc.next());

				session.update(p);
				session.beginTransaction().commit();
			}

		}

	}

	@Override
	public void updateAdharData() {
		System.out.println("Enter Adhar id");
		Session session = sf.openSession();

		int id = sc.nextInt();
		AdharCard adhar1 = session.get(AdharCard.class, id);
		if (adhar1 != null) {
			System.out.println("Enter Adhar Name");
			adhar1.setaName(sc.next());

			System.out.println("Enter Adhar Number");
			adhar1.setaNumber(sc.next());

			session.update(adhar1);
			session.beginTransaction().commit();

			System.out.println("update Successfully..");
		} else {
			System.out.println("update not found..");
		}
	}

}
