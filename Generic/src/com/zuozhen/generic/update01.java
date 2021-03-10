package com.zuozhen.generic;

import org.junit.Test;

import java.util.ArrayList;

public class update01 {
    @Test
    public void test() throws Exception {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list1.getClass() == list2.getClass());//true
        /*
        类型擦除，Java在编译期间，所有的泛型信息都会被擦掉
         */
        //list1.add(1);//报错
        //反射添加
        list1.getClass().getMethod("add", Object.class).invoke(list1, 10);
        /*
        类型擦除后保留的原始类型
        原始类型：擦除去了泛型信息，最后在字节码中的类型变量的真正类型，
        无论何时定义一个泛型，相应的原始类型都会被自动提供，类型变量擦除，
        并使用其限定类型（无限定的变量用Object）替换。
        例：
        public class Pair<T extends Comparable>()
        原始类型为Comparable
         */
        /*
        类型擦除问题解决：
        先检查，再类型擦除及编译
        类型检查针对的是引用
         */
        ArrayList<Integer> test1 = new ArrayList<>();
        ArrayList test2 = new ArrayList<Integer>();
//        test1.add("123");//编译时报错
//        test2.add("123");//编译时不报错
        /*
        自动类型转换：
        在return之前return (E)Xxx;
        除此之外其他场景中字节码也会插入强制类型转换
         */
    }
}
