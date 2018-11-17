package edu.poly.stockmanagement.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private volatile static SessionFactory sessionFactory;

	public static SessionFactory getSessionfactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			} catch (HibernateException e) {
				throw e;
			}
		}
		return sessionFactory;
	}

}
