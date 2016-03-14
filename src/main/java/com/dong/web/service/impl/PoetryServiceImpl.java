package com.dong.web.service.impl;

import com.dong.web.dao.common.PoetryDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dchuan on 2016/3/14.
 */
@Transactional
public class PoetryServiceImpl {

    // Fields

    private PoetryDao poetryDao;

    // Setters and getters

    public PoetryDao getPoetryDao() {
        return poetryDao;
    }

    public void setPoetryDao(PoetryDao poetryDao) {
        this.poetryDao = poetryDao;
    }
}
