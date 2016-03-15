package com.dong.web.dao.common;

import com.dong.web.model.Poetry;

import java.util.List;


/**
 * Created by dchuan on 2016/3/14.
 */
public interface PoetryDao extends BaseDao<Poetry> {

    public List<Poetry> getPoetryByTitle(String title);

    public List<Poetry> getPoetryByContent(String content);

    public List<Poetry> getPoetryByTitleAndPoetName(String title, String name);

}
