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
 * 通过标题和作者来查找
 * Created by chuandong on 16/1/23.
 */
public class SearchActionByTitleAndPoet extends ActionSupport{

    // 诗歌标题
    private String poetryTitle;
    // 诗歌的作者
    private String poet;
    // 选择LIST来防止题目重复的作品
    private List<Poetry> poetryList = new ArrayList<Poetry>();

    @Override
    public String execute() throws Exception {

        Connection conn = DBHelper.getInstance();

        PreparedStatement pstmt = conn.prepareStatement(DBStatement.getPoetriesByTitleAndPoet);
        pstmt.setString(1, poetryTitle);
        pstmt.setString(2, poet);

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            poetryList.add(new Poetry(rs.getInt("id"),
                    poet,
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

    public String getPoet() {
        return poet;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }
}
