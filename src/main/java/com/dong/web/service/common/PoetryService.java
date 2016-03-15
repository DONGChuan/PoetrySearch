package com.dong.web.service.common;

import com.dong.web.model.Poetry;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
public interface PoetryService {

    public List<Poetry> getPoetriesByTitle(String title);

    public List<Poetry> getPoetriesByContent(String content);

    public List<Poetry> getPoetriesByTitleAndPoetName(String title, String name);

}
