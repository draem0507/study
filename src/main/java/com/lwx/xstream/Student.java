package com.lwx.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/1/29 23:44
 */

public class Student {


    private int age;


    private String name;


    public Student(){}


    public Student(int age,String name){

        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
