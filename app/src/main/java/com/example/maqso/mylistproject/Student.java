package com.example.maqso.mylistproject;

/**
 * Created by maqso on 10/2/2017.
 */

public class Student {
    private String name;
    private  String reg;


    public Student(String name, String reg) {
        this.name = name;
        this.reg = reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }
}
