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

        Connection conn = DBHelper.getInstance();

        PreparedStatement pstmt = conn.prepareStatement(DBStatement.getPoetriesByContent);
        pstmt.setString(1, "%"+poetryContent+"%"); // 查找包含该内容的诗歌

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            poetryList.add(new Poetry(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("title"),
                    rs.getString("content")));
        }

        if(poetryList.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }

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
