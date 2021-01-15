package com.zuozhen.stringlearning;

import org.junit.Test;

/**
 * String
 */
public class StringTest {
    /*
    字符串拼接
     */
    @Test
    public void test4() {
        String s1 = "javaEEhadoop";
        final String s2 = "javaEE";
        String s4 = s2 + "hadoop";//s2视为常量
        System.out.println(s1 == s4);//true
    }

    @Test
    public void test3() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";//1.字面量的连接就放在常量池里
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;//2.存在变量的是在堆空间新new的

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s7.intern();//3.返回得到的s8是使用的常量池中已经存在的字符串常量
        System.out.println(s3 == s8);//true
    }

    /*
    String实例化方式：
    1.通过字面量定义
    2.new+构造器

    面试题：
    String s = new String("abc");内存中创建了几个对象
    两个：一个是堆空间中的结构，另一个是char[]对应的常量池中的数据“abc”
     */
    @Test
    public void test2() {
        //数据声明在方法区中的字符串常量池中，目的是共享
        String s1 = "javaEE";
        String s2 = "javaEE";
        //s3,s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        //先堆，后指向常量池
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.name.equals(p2.name));//true
        //解释：
        //对象的实例化存储在堆里，name存储的是地址值，地址值对应的是方法区中的字符串常量池中
        System.out.println(p1.name == p2.name);//true

    }

    /*
    String：字符串“”
    1.声明为final，不可被继承
    2.实现了Serializable：表String支持序列化
      实现了Comparable：表示String可以比较大小
    3.内部定义了final char[] value 用于存储字符串数据
    4.不可变的字符序列，不可变性
        4.1当对字符串重新赋值时，需要重新指定内存区域重写，不能使用原有的value
        4.2当对现有字符串进行连接操作时，需要重新指定内存区域赋值
        4.3当调用String的replace方法修改字符或者字符串时也必须重新制定内存区域赋值
    5.通过字面量的方式（区别于new给一个字符串赋值，此时的字符串值声明在字符串常量池中）
    6.字符串常量池中是不会存储相同内容字符串的
     */
    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        //s1 = "hello";

        System.out.println(s1 == s2);//比较地址值
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("**********************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("**********************");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);
    }
}
