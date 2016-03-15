package com.dong.web.dao.impl;

import com.dong.web.dao.common.PoetryDao;
import com.dong.web.model.Poetry;
import com.dong.web.utils.DBStatement;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
public class PoetryDaoImpl extends BaseDaoImpl<Poetry> implements PoetryDao {

    // Fields

    private SessionFactory sessionFactory;

    // Functions

    @Override
    public List<Poetry> getPoetryByTitle(String title) {

        List<Poetry> result = sessionFactory.getCurrentSession().createQuery(DBStatement.getPoetriesByTitle)
                .setString("title", title)
                .list();

        return result;
    }

    // Setters and getters

    @Override
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
