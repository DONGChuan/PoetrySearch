package com.dong.web.action;

import com.dong.web.model.Poetry;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过标题来查找
 * Created by chuandong on 16/1/23.
 */
public class SearchActionByTitle extends ActionSupport{

    // 诗歌标题
    private String poetryTitle;
    // 选择LIST来防止题目重复的作品
    private List<Poetry> poetryList = new ArrayList<Poetry>();

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getPoetryTitle() {
        return poetryTitle;
    }

    public void setPoetryTitle(String poetryTitle) {
        this.poetryTitle = poetryTitle;
    }

    public List<Poetry> getPoetryList() {
        return poetryList;
    }

    public void setPoetryList(List<Poetry> poetryList) {
        this.poetryList = poetryList;
    }
}
