package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

    private int techid;
    private String tehcname;
    public int getTechid() {
        return techid;
    }

    public String getTehcname() {
        return tehcname;
    }

    public void setTechid(int techid) {
        this.techid = techid;
    }

    public void setTehcname(String tehcname) {
        this.tehcname = tehcname;
    }
    public void tech(){
        System.out.println("Completed");
    }

}
