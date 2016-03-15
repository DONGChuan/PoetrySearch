package com.dong.web.action;

import com.dong.web.model.Poetry;
import com.dong.web.service.common.PoetService;

import com.dong.web.service.common.PoetryService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;


/**
 * Search Action By Poet Name
 * Created by chuandong on 16/1/23.
 */
public class SearchPoetryAction extends ActionSupport{

    // Fields

    private PoetryService poetryService; // DI
    private String poetName;
    private String poetryTitle;
    private String poetryContent;
    private List<Poetry> poetryList;

    // Functions

    public String searchByPoetName() throws Exception {

        poetryList = poetryService.getPoetriesByPoetName(poetName);

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String searchByTitle() throws Exception {

        poetryList = poetryService.getPoetriesByTitle(poetryTitle);

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String searchByContent() throws Exception {

        poetryList = poetryService.getPoetriesByContent(poetryContent);

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String searchByTitleAndPoetName() throws Exception {

        poetryList = poetryService.getPoetriesByTitleAndPoetName(poetryTitle, poetName);

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    // Setters and getters

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

    public PoetryService getPoetryService() {
        return poetryService;
    }

    public void setPoetryService(PoetryService poetryService) {
        this.poetryService = poetryService;
    }

    public String getPoetryTitle() {
        return poetryTitle;
    }

    public void setPoetryTitle(String poetryTitle) {
        this.poetryTitle = poetryTitle;
    }

    public String getPoetryContent() {
        return poetryContent;
    }

    public void setPoetryContent(String poetryContent) {
        this.poetryContent = poetryContent;
    }
}
