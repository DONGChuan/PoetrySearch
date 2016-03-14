/**
 * 
 */
package com.dong.web.dao.common;

import com.dong.web.model.PageModel;

import java.util.List;

/**
 * @author DONGChuan
 * Generic DAO
 */
public interface BaseDao<T> {

	/**
	 * Add a new entity
	 * @param entity entity to add
	 */
	public void save(T entity);
	
	/**
	 * Delete an entity by id
	 * @param id id of entity
	 */
	public void delete(int id);
	
	/**
	 * Update an entity
	 * @param entity entity to update
	 */
	public void edit(T entity);
	
	/**
	 * Get entity by id
	 * @param id id of entity
	 * @return entity if success，null if fail
	 */
	public T get(Integer id);
	
	/**
	 * Get entity by id
	 * @param id id of entity
	 * @return entity if success，exception if fail
	 */
	public T load(Integer id);
	
	/**
	 * Get all entities
	 * @return list of all entities
	 */
	public List<T> findAll();
	
	/**
	 * Get total number of entities
	 * @return total number of entities
	 */
	public int totalCount();
	
	/**
	 * Get specified page
	 * @param pageNo current page number
	 * @param pageSize size of page
	 * @return PageModel
	 */
	public PageModel<T> findByPager(int pageNo, int pageSize);
	
	/**
	 * Update operation based on the specified SQL statement
	 * @param sql SQL statement
	 */
	public void update(String sql);
	
	/**
	 * Query an unique object based on the specified SQL statement
	 * @param sql SQL statement
	 * @return entity to search
	 */
	public T findUnique(String sql);
}
