package com.zuozhen.stringlearning;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * String类和其他类之间的转换
 */
public class StringTest1 {

    /*
    String 与 byte[]
    String->byte[]:调用getBytes
    byte[]->String:调用String的构造器

    编码：字符串->字节
    解码：字节->字符串

     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));//[97, 98, 99, 49, 50, 51, -28, -72, -83, -27, -101, -67]
        byte[] bytes1 = str1.getBytes("gbk");//指定编码集
        System.out.println(Arrays.toString(bytes1));//[97, 98, 99, 49, 50, 51, -42, -48, -71, -6]

        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(bytes1,"gbk");//指定解码集
        System.out.println(str3);

    }
    /*
    String 与 char[]
    String->char[]:调用String的toCharArray
    char[]->String:调用Strign构造器
     */
    @Test
    public void test2() {
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for(char c: charArray){
            System.out.println(c);
        }
        char[] arr = {'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);//hello
    }

    /*
    String与基本数据类型，包装类之间的转换
    String--》基本数据类型，包装类
    基本数据类型，包装类-》String：调用String重载的valueOf
     */
    @Test
    public void test1() {
        String str1 = "123";//常量池里
        int num = Integer.parseInt(str1);
        System.out.println(num);//123
        String str2 = String.valueOf(num);//堆里
        System.out.println(str2);
        System.out.println(str1 == str2);
    }
}
