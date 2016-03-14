package com.dong.web.dao.impl;

import com.dong.web.dao.common.PoetDao;
import com.dong.web.model.Poet;
import com.dong.web.model.Poetry;
import com.dong.web.utils.DBStatement;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
public class PoetDaoImpl extends BaseDaoImpl<Poet> implements PoetDao {

    // Fields

    private SessionFactory sessionFactory;

    // Function

    @Override
    public List<Poetry> getPoetriesByPoetName(String poetName) {

        List<Poetry> result = sessionFactory.getCurrentSession().createQuery(DBStatement.getPoetriesByPoetName)
                .setString("name", poetName)
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