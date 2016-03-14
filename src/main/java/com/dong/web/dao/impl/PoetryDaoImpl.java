package com.dong.web.dao.impl;

import com.dong.web.dao.common.PoetryDao;
import com.dong.web.model.Poetry;
import org.hibernate.SessionFactory;

/**
 * Created by dchuan on 2016/3/14.
 */
public class PoetryDaoImpl extends BaseDaoImpl<Poetry> implements PoetryDao {

    // Fields

    private SessionFactory sessionFactory;

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
