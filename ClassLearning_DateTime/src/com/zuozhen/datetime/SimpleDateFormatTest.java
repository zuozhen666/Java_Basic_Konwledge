package com.zuozhen.datetime;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;

/*
jdk8之前日期和时间API测试
java.text.SimpleDateFormat
 */
public class SimpleDateFormatTest {
    /*
    SimpleDateFormat：对日期Date类的格式化和解析
    1.两个操作；
    1.1格式化：日期->字符串
    1.2解析：格式化逆过程
    2.实例化；
     */
    @Test
    public void test() throws ParseException {
        //实例化，默认构造器
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化日期
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //解析
        String str = "21-1-17 上午10:38";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        //指定方式构造器
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

    }
}
