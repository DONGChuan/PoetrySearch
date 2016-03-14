package com.dong.web.action;

import com.dong.web.model.Poetry;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过内容来查找
 * Created by chuandong on 16/1/23.
 */
public class SearchActionByContent extends ActionSupport{

    // 用户输入的查找内容
    private String poetryContent;
    // 选择LIST来防止题目重复的作品
    private List<Poetry> poetryList = new ArrayList<Poetry>();

    @Override
    public String execute() throws Exception {

        return "";

    }

    public String getPoetryContent() {
        return poetryContent;
    }

    public void setPoetryContent(String poetryContent) {
        this.poetryContent = poetryContent;
    }

    public List<Poetry> getPoetryList() {
        return poetryList;
    }

    public void setPoetryList(List<Poetry> poetryList) {
        this.poetryList = poetryList;
    }
}
