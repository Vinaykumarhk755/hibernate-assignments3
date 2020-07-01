package com.dxc.hibernateassignment3;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Customer_Operation {

	public static void main(String args[]) {
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");		
	SessionFactory factory = config.buildSessionFactory();
	Session session = factory.openSession();		
	Transaction transaction = session.beginTransaction();
	
	public	int addCustomer(Customer customer) 
		{
			customer.setCustomer_name("vinay");
			customer.setCustomer_dob(null);
			customer.setCustomer_email("vinay@gmail.com");
			customer.setCustomer_id(101);
			return 1;
		}
	public List<Customer> showallcustomers()
	
	{
		showallcustomers.get(0);
		showallcustomers.get(1);
		showallcustomers.get(2);
		showallcustomers.get(3);
	}

	}
}
