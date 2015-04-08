package com.kishan.webapp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class UserDAO 
{
	public static int register(User u)
	{
		int i=0;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		t.begin();
		
		i=(Integer)session.save(u);
		t.commit();
		session.close();
		return i;
	}
}
