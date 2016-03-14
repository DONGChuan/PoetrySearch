/**
 * 
 */
package com.dong.web.dao.impl;

import com.dong.web.dao.common.BaseDao;
import com.dong.web.model.PageModel;
import org.hibernate.SessionFactory;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author DONGChuan
 * Implementation of BaseDao
 */
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {

	// Fields

	private Class<T> clazz; // Class type
	private SessionFactory sessionFactory;

	// Constructor

	public BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>)type.getActualTypeArguments()[0];
	}

	// Functions

	@Override
	public void save(T entity) {
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(get(id));
	}

	@Override
	public void edit(T entity) {
		sessionFactory.getCurrentSession().merge(entity);
	}

	@Override
	public T get(Integer id) {
		return (T)sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public T load(Integer id) {
		return (T)sessionFactory.getCurrentSession().load(clazz, id);
	}

	@Override
	public List<T> findAll() {
		String hql = "SELECT t FROM " + clazz.getSimpleName() + " t";
		
		return (List<T>)sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	@Override
	public int totalCount() {

		int count = 0;
		String hql = "SELECT count(t) FROM " + clazz.getSimpleName() + " t";
		Long temp = (Long)sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();

		if(temp != null){
			count = temp.intValue();
		}

		return count;
	}

	@Override
	public PageModel<T> findByPager(int pageNo, int pageSize) {

		PageModel<T> pm = new PageModel<T>(pageNo, pageSize);
		String hql = "select t from " + clazz.getSimpleName() + " t";
		pm.setDatas(sessionFactory.getCurrentSession().createQuery(hql).setFirstResult(pageNo).setMaxResults(pageSize).list());
		pm.setRecordCount(totalCount());

		return pm;
	}

	@Override
	public void update(String sql) {
        sessionFactory.getCurrentSession().createQuery(sql);
	}

	@Override
	public T findUnique(String sql) {
		return (T)sessionFactory.getCurrentSession().createQuery(sql).uniqueResult();
	}

	// Setters and Getters

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
