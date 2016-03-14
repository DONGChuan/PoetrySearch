package com.dong.web.model;

import javax.persistence.*;

/**
 * Created by dchuan on 2016/3/14.
 */
@Entity
@Table(name = "poets")
public class Poet {

    // Fields

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    // Constructor

    public Poet() {}

    // Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
