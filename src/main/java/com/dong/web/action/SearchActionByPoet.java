package com.dong.web.action;

import com.dong.web.model.Poetry;
import com.dong.web.utils.DBHelper;

import com.dong.web.utils.DBStatement;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过作者来查找
 * Created by chuandong on 16/1/23.
 */
public class SearchActionByPoet extends ActionSupport{

    // 作者的姓名
    private String poetName;
    // 诗歌的 list
    private List<Poetry> poetryList = new ArrayList<Poetry>();

    @Override
    public String execute() throws Exception {

        Connection conn = DBHelper.getInstance();

        PreparedStatement pstmt = conn.prepareStatement(DBStatement.getPoetriesByPoet);
        pstmt.setString(1, poetName);

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            poetryList.add(new Poetry(poetName, rs.getString("title")));
        }

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }

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
