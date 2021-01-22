package com.zuozhen.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 * 3.Hashtable：古老的实现类，线程安全，效率低，不能存储null的key和value
 * 3.1 Properties：常用来处理配置文件，key和value均为String类型
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);//加载流对应的文件
        /*
        文件内容
        name=Tom
        password=abc123
         */
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name+" "+password);//Tom abc123
    }
}
