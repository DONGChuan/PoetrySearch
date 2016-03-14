package com.dong.web.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by chuandong on 16/1/21.
 */
@Entity
@Table(name = "poetries")
public class Poetry {

    // Fields

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne(targetEntity = Poet.class)
    @JoinColumn(name = "poet_id", nullable = false)
    private Poet poet;

    // Constructor

    public Poetry() {}

    // Setters and Getters

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

    public Poet getPoet() {
        return poet;
    }

    public void setPoet(Poet poet) {
        this.poet = poet;
    }
}
