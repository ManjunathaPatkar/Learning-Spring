package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Customers {
    private int custid;
    private String cname;
    private String coursename;
    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail() {
        return techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }



    public void setCustid(int custid) {
        this.custid = custid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCustid() {
        return custid;
    }

    public String getCname() {
        return cname;
    }

    public String getCoursename() {
        return coursename;
    }
    public void display(){
        System.out.println("Customers Object returned successfully");
        techdetail.tech();

    }


}
