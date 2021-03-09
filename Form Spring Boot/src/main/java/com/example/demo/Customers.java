package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Customers {
    private int cid;
    private String cname;
    private String cmail;
    @Override
    public String toString() {
        return "Customers{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cmail='" + cmail + '\'' +
                '}';
    }

    @Id

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

    public String getCmail() {
        return cmail;
    }

    public void setCmail(String cmail) {
        this.cmail = cmail;
    }

}
