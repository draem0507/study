package com.lwx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:
 * @date: 2020-01-03 11:47
 * @desc: 正则表达式
 */
public class RegularExpression {


    public static void main(String[] args){

        String str="1(ab)2";
        Pattern pattern = Pattern.compile("\'(.*?)\'");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            String temp = matcher.group();
            temp = temp.replace("'", "");

        }
    }


}
