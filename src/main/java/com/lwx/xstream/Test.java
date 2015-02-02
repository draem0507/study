package com.lwx.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @title
 * @see http://my.oschina.net/sedricD/blog/145492
 * @desc
 * @atuh lwx
 * @createtime on 2015/1/29 23:35
 */
public class Test {


    public static void main(String []args){

        Person person=new Person(28,"hello");

        XStream xStream=  new XStream();
       /* <com.lwx.xstream.Person>
        <age>28</age>
        <name>hello</name>
        </com.lwx.xstream.Person>*/
        System.out.println(xStream.toXML(person));

        System.out.println();
        //使用xstream自带的NoNameCoder构造xstream，该方式将导致所有特殊字符都不转义
        //XStream xstream = new XStream(new XppDriver(new NoNameCoder()));
//使用Domdriver及NonameCoder构造xstream，该方式可以指定xml编码方式
       // XStream xstream = new XStream(new DomDriver("UTF-8", new NoNameCoder()));
        /**如果自定义了标签 则必须开启autodetectAnnotations 并且 添加对应的class对象*/
        xStream.autodetectAnnotations(true);
        xStream.processAnnotations(Person.class);
        xStream.processAnnotations(Student.class);
        xStream.processAnnotations(Map.class);
        person.setMy_score("my_score");
        person.setSports(Arrays.asList(new String[]{"aa","bb"})); //正常输出 <sports class="java.util.Arrays$ArrayList">
        Map<String,String>map=new HashMap<String, String>();
        map.put("key1","kk");
        map.put("key2","k2");
        person.setMap(map);
        person.setStudent(new Student(10, "26"));
        xStream.alias("aliasStuent11",Student.class);//不起作用
        xStream.alias("aliasStuent",Person.class);//优先级高于配置
        System.out.println(xStream.toXML(person));



    }


}
