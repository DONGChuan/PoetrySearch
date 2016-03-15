package com.dong.web.dao.impl;

import com.dong.web.dao.common.PoetDao;
import com.dong.web.model.Poet;
import org.hibernate.SessionFactory;


/**
 * Created by dchuan on 2016/3/14.
 */
public class PoetDaoImpl extends BaseDaoImpl<Poet> implements PoetDao {

    // Fields

    private SessionFactory sessionFactory;

    // Function

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