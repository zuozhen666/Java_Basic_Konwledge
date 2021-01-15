package com.zuozhen.datetime;

import org.junit.Test;

import java.util.Date;

/*
jdk8之前日期和时间API测试
 */
public class DateTimeTest {

    /*
    java.util.Date类
    1.两个构造器的使用
    2.两个方法的使用
        ->toString();显示当前的年月日时分秒
        ->getTime();时间戳
    java.sql.Date对应着数据库中的日期类型的变量
    util.Date转换为sql.Date
     */

    @Test
    public void test2() {
        //构造器一：Date()：创建了一个对应当前时间的Date对象
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        //构造器二：创建指定毫秒数的Date对象
        Date date1 = new Date(1610693789859L);
        System.out.println(date1.toString());

        //java.sql.Date 对象
        java.sql.Date date2 = new java.sql.Date(1610693789859L);
        System.out.println(date2);

        //util.Date转换为sql.Date
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());

    }

    @Test
    public void test1() {
        //返回当前时间与1970.1.1.0：0：0之间以毫秒为单位的时间差
        //称为时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
