package com.dong.web.action;

import com.dong.web.model.Poetry;
import com.dong.web.service.common.PoetService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;


/**
 * Search Action By Poet Name
 * Created by chuandong on 16/1/23.
 */
public class SearchActionByPoet extends ActionSupport{

    // Fields

    private PoetService poetService;
    private String poetName;
    private List<Poetry> poetryList;

    // Functions

    @Override
    public String execute() throws Exception {

        poetryList = poetService.getPoetriesByPoetName(poetName);
        System.out.println(poetryList.get(2).getTitle());
        System.out.println("aaaaaaaaaaaa");
        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }

    }

    // Setters and getters

    public PoetService getPoetService() {
        return poetService;
    }

    public void setPoetService(PoetService poetService) {
        this.poetService = poetService;
    }

    public String getPoetName() {
        return poetName;
    }

    public void setPoetName(String poetName) {
        this.poetName = poetName;
    }

    public List<Poetry> getPoetryList() {
        return poetryList;
    }

    public void setPoetryList(List<Poetry> poetryList) {
        this.poetryList = poetryList;
    }
}
