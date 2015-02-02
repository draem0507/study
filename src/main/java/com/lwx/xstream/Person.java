package com.lwx.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;
import java.util.Map;

/**
 * @title what to do .
 * @desc
 * @atuh lwx
 * @createtime on 2015/1/29 23:35
 */
@XStreamAlias(value="myPerson")
public class Person {

    private int age;

    @XStreamAlias("my_name")
    private String name;


    private String my_score;

    /**
     * itemFieldName 自定义节点名称
     * ,keyFieldName = "如果是Lists 则新增一个String_Field子节点
     * */
    @XStreamImplicit(itemFieldName="自定义标签",keyFieldName = "String_Field")
    private List<String>sports;

    @XStreamImplicit(itemFieldName="selfmap",keyFieldName = "Map_Field")
    private Map<String ,String>map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getSports() {
        return sports;
    }

    public void setSports(List<String> sports) {
        this.sports = sports;
    }

    public String getMy_score() {
        return my_score;
    }

    public void setMy_score(String my_score) {
        this.my_score = my_score;
    }

    @XStreamAlias(value = "XStreamAlias")
    private Student student;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Person(){}


    public Person(int age,String name){

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
