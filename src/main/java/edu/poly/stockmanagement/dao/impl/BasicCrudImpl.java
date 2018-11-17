package edu.poly.stockmanagement.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.poly.stockmanagement.dao.BasicCrud;
import edu.poly.stockmanagement.util.HibernateUtil;

/**
 * Lớp thực thi giao diện BasicCrud.
 * 
 * @author Manh Nguyen
 *
 * @param <T> Kiểu dữ liệu
 * @param <ID> Kiểu dữ liệu ID của kiểu dữ liệu <code>&ltT&gt</code>
 */
public class BasicCrudImpl<T, ID extends Serializable> implements BasicCrud<T, ID> {

	protected SessionFactory sessionFactory;

	public BasicCrudImpl() {
		sessionFactory = HibernateUtil.getSessionfactory();
	}

	@Override
	public T save(T object) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(object);
			tx.commit();
			session.refresh(object);
			return object;
		} catch (Exception e) {
			if (tx != null)
				if (tx.isActive())
					tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public T update(T object) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(object);
			tx.commit();
			session.refresh(object);
			return object;
		} catch (Exception e) {
			if (tx != null)
				if (tx.isActive())
					tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public T saveOrUpdate(T object) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.saveOrUpdate(object);
			tx.commit();
			session.refresh(object);
			return object;
		} catch (Exception e) {
			if (tx != null)
				if (tx.isActive())
					tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean delete(T object) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.delete(object);
			tx.commit();
			return true;
		} catch (Exception e) {
			if (tx != null)
				if (tx.isActive())
					tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public T findById(Class<T> clazz, ID id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			T object = session.get(clazz, id);
			tx.commit();
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public List<T> findAll(Class<T> clazz) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			TypedQuery<T> query = session.createQuery(String.format("FROM %s", clazz.getName()), clazz);
			List<T> result = query.getResultList();
			tx.commit();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

}
