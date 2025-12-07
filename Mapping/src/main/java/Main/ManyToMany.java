package Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import manyToMany.Bank;
import manyToMany.Customer;

public class ManyToMany {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Bank.class);
		cfg.addAnnotatedClass(Customer.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Bank b1 = new Bank();
		b1.setBname("Bank of Maharashtra");
		b1.setLocation("Nigadi");

		Bank b2 = new Bank();
		b2.setBname("Bank of India");
		b2.setLocation("Ravet");

		Customer c1 = new Customer();
		c1.setCustid(101);
		c1.setName("Shubham");
		c1.setCity("Akurdi");
		c1.setBank(null);

		Customer c2 = new Customer();
		c2.setCustid(102);
		c2.setName("Ashish");
		c2.setCity("Ravet");
		c2.setBank(null);

		Customer c3 = new Customer();
		c3.setCustid(103);
		c3.setName("Nikhil");
		c3.setCity("Pune");
		c3.setBank(null);

		List<Bank> allBanks = new ArrayList<>();
		allBanks.add(b1);
		allBanks.add(b2);

		c1.setBank(allBanks);
		c2.setBank(allBanks);
		c3.setBank(allBanks);

		List<Customer> allCustomers = new ArrayList<>();
		allCustomers.add(c1);
		allCustomers.add(c2);
		allCustomers.add(c3);

		b1.setCust(allCustomers);
		b2.setCust(allCustomers);

		ss.persist(b1);
		ss.persist(b2);
		ss.persist(c1);
		ss.persist(c2);
		ss.persist(c3);

		tr.commit();
		ss.close();

	}
}
