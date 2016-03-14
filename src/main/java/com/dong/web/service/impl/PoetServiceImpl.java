package com.dong.web.service.impl;

import com.dong.web.dao.common.PoetDao;
import com.dong.web.dao.common.PoetryDao;

/**
 * Created by dchuan on 2016/3/14.
 */
public class PoetServiceImpl {

    private PoetDao poetDao;

    public PoetDao getPoetDao() {
        return poetDao;
    }

    public void setPoetDao(PoetDao poetDao) {
        this.poetDao = poetDao;
    }
}
