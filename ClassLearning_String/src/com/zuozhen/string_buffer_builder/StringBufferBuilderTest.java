package com.zuozhen.string_buffer_builder;

import org.junit.Test;

/*
* StringBuffer/StringBuilder
* */
public class StringBufferBuilderTest {
    /*
    常用方法：
     */
    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('2');
        System.out.println(s1);//abc12
        s1.delete(2,3);
        System.out.println(s1);//ab12
        s1.replace(0,3,"hh");
        System.out.println(s1);//hh2
        s1.insert(2,"a");
        System.out.println(s1);//hha2
        s1.reverse();//翻转
        System.out.println(s1);//2ahh
        s1.setCharAt(0,'1');
        System.out.println(s1);//1ahh
        //...
    }

    /*
    String,StringBuffer,StringBuilder异同
    String:不可变的字符序列；
    StringBuffer:可变的字符序列：线程安全，效率低；
    StringBuilder:可变的字符序列：jdk5.0新增，线程不安全，效率高；

    分析：
    StringBuffer sb1 = new StringBuffer();//char[] value = new char[16];
    sb1.append('a');//value[0]='a';

    StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length + 16]；

    扩容问题：
    默认扩容为原来容量*2+2，同时将数组中元素复制即可

    实际开发建议使用StringBuffer(int capacity) or StringBuilder(int capacity)

     */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);//mbc
    }
}
