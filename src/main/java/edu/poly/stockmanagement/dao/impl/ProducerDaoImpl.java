package edu.poly.stockmanagement.dao.impl;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.poly.stockmanagement.dao.ProducerDao;
import edu.poly.stockmanagement.model.Producer;

public class ProducerDaoImpl extends BasicCrudImplDao<Producer, Integer> implements ProducerDao {

	@Override
	public Producer findByCode(String code) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			TypedQuery<Producer> query = session.createQuery("SELECT p FROM Producer p WHERE p.code = :code",
					Producer.class); // tạo truy vấn tới bảng producer với điều kiện là findByCode(String code)
			// SELECT * FROM Abc WHERE id = ? AND name = ?
			query.setParameter("code", code);
			Producer object = query.getSingleResult();
			tx.commit();
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

}
