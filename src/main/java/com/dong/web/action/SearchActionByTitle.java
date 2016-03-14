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

        Connection conn = DBHelper.getInstance();

        PreparedStatement pstmt = conn.prepareStatement(DBStatement.getPoetriesByTitle);
        pstmt.setString(1, poetryTitle);

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            poetryList.add(new Poetry(rs.getInt("id"),
                    rs.getString("name"),
                    poetryTitle,
                    rs.getString("content")));
        }

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }

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
