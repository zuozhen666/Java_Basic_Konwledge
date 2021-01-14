package com.zuozhen.questions;

import java.util.SortedMap;

/*
 * 面试题1
 * */
public class Question1 {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        question1.change(question1.str, question1.ch);
        //尼玛，第一次做全错，哈哈哈
        //1.引用数据类型传递的是地址值，但是String具有不可变性，我理解了，
        //引用其实就是个变量而已，只要原引用指向的对象没有被改变，那么在子程序退出后还是莫得问题
        //str=“test ok”这句话其实就是在内存里有创建了一个String对象而已，str只是在当前程序里暂时指向新的对象而已
        //2.数组没有不可变性
        System.out.println(question1.str);//good
        System.out.println(question1.ch);//best
    }
}
