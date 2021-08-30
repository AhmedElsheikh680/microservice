package com.rest.webservice.model;

import java.util.Date;

public class User {

    private Integer id;
    private  String nae;

    private Date yDate;

    public User() {
    }

    public User(Integer id, String nae, Date yDate) {
        this.id = id;
        this.nae = nae;
        this.yDate = yDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNae() {
        return nae;
    }

    public void setNae(String nae) {
        this.nae = nae;
    }

    public Date getyDate() {
        return yDate;
    }

    public void setyDate(Date yDate) {
        this.yDate = yDate;
    }
}
