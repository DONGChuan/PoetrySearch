package com.dong.web.service.impl;

import com.dong.web.dao.common.PoetDao;
import com.dong.web.model.Poetry;
import com.dong.web.service.common.PoetService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
@Transactional
public class PoetServiceImpl implements PoetService {

    // Fields

    private PoetDao poetDao;

    // Functions

    // Setters and getters

    public PoetDao getPoetDao() {
        return poetDao;
    }

    public void setPoetDao(PoetDao poetDao) {
        this.poetDao = poetDao;
    }
}
