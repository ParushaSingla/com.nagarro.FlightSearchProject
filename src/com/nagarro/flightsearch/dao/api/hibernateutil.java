package com.nagarro.flightsearch.dao.api;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.user;

public class hibernateutil {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	static {
		configuration = new Configuration().configure("com/nagarro/flightsearch/util/hibernate.cfg.xml")
				.addAnnotatedClass(user.class).addAnnotatedClass(Flight.class);

		sessionFactory = configuration.buildSessionFactory();
	}

	public static Session getSession() {
		Session session = null;
		if (sessionFactory != null) {
			session = sessionFactory.openSession();
		}
		return session;
	}
}