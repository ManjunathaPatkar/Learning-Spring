package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
    @GeneratedValue
    private int cid;
    private String coursename;
    private String cname;
    @Override
    public String toString() {
        return "Customers{" +
                "cid=" + cid +
                ", coursename='" + coursename + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }


    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

}
