package edu.poly.stockmanagement.util;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.poly.stockmanagement.dao.BasicCrudDao;
import edu.poly.stockmanagement.dao.ProducerDao;
import edu.poly.stockmanagement.dao.impl.BasicCrudImplDao;
import edu.poly.stockmanagement.dao.impl.ProducerDaoImpl;
import edu.poly.stockmanagement.model.Producer;

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

	public static void main(String[] args) {

		try {
			//ProducerDao producerDao = new ProducerDaoImpl();
			
			BasicCrudDao<Producer, Integer> producerDao = new BasicCrudImplDao<>();
			Producer producer = new  Producer();
			producer.setCode("LO`L");
			producer.setName("LOL");
			producerDao.save(producer);
			ArrayList<E>

			//Producer producer = producerDao.findByCode("LO`L");
			//producerDao.delete(producer);
		} finally {
			getSessionfactory().close();
		}

	}

}
