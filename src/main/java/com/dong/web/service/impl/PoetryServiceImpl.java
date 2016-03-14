package com.dong.web.service.impl;

import com.dong.web.dao.common.PoetryDao;

/**
 * Created by dchuan on 2016/3/14.
 */
public class PoetryServiceImpl {

    private PoetryDao poetryDao;

    public PoetryDao getPoetryDao() {
        return poetryDao;
    }

    public void setPoetryDao(PoetryDao poetryDao) {
        this.poetryDao = poetryDao;
    }
}
