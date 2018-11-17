package edu.poly.stockmanagement.dao;

import java.io.Serializable;
import java.util.List;

public interface BasicCrud<T, ID extends Serializable> {

	T save(T object);

	T update(T object);

	T saveOrUpdate(T object);

	boolean delete(ID id, Class<T> clazz);

	boolean delete(T object);

	T findById(ID id);

	List<T> findAll(Class<T> clazz);

}
