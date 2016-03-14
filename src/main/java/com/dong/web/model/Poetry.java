package com.dong.web.model;

/**
 * Created by chuandong on 16/1/21.
 */
public class Poetry {

    private int id;
    private String author;
    private String title;
    private String content;

    public Poetry(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Poetry(int id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
