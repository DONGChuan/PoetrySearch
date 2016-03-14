package com.dong.web.dao.common;

import com.dong.web.model.Poet;
import com.dong.web.model.Poetry;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
public interface PoetDao extends BaseDao<Poet> {

    public List<Poetry> getPoetriesByPoetName(String poetName);

}
