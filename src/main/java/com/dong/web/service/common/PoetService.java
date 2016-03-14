package com.dong.web.service.common;

import com.dong.web.model.Poetry;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
public interface PoetService {

    public List<Poetry> getPoetriesByPoetName(String poetName);

}
