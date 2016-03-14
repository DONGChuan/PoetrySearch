package com.dong.web.model;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(targetEntity = Poetry.class)
    @JoinColumn(name = "poet_id", referencedColumnName = "poet_id")
    private Set<Poetry> poetries;

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

    public Set<Poetry> getPoetries() {
        return poetries;
    }

    public void setPoetries(Set<Poetry> poetries) {
        this.poetries = poetries;
    }
}
