package com.zuozhen.generic;

import org.junit.Test;

import java.util.*;

/*
 * 泛型（“标签”）
 * jdk5.0新增特性
 * //自定义泛型结构
 * 泛型类、泛型接口；泛型方法
 */
public class GenericTest {
    @Test
    public void test() {
        /*
        集合中使用泛型
         */
        ArrayList<Integer> list = new ArrayList<>();//不能是基本数据类型，需要用其包装类

        //hashMap
        Map<String, Integer> map = new HashMap<String, Integer>();
        /*
        自然排序和定制排序之后也要指明类型
         */
    }

    @Test
    public void test1() {
        //实例化时没有指明类的泛型，默认为Object
        //要求：最好都要在实例化时指明泛型的类型
        Order order = new Order();
        order.setOrderT(123);

        Order<String> order1 = new Order<>("AA", "BB", 123);
        System.out.println(order1);

        //测试泛型方法
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aa");
        strings.add("bb");
        //调用时指明泛型参数的类型
        List list = order.copyFromArrayToList(strings);
        System.out.println(list);
    }

    /*
    1.泛型在继承方面的体现：A是B的父类，但是G<A>和G<B>无子父类关系，为并列关系
    //A<G>是B<G>的父类
     */
    /*
    通配符的使用：
    通配符：?
     */
    @Test
    public void test2() {
        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;//可以视为通用父类
        list = list1;//均可
        list = list2;//均可
        //不能向list添加数据，除了null
        //允许读取数据，类型为Object
    }

    public void print(List<?> list) {
        //...
    }
    /*
    有限制条件的通配符的使用
    G<? extends Xxx>   <=
    G<? super Xxx>     >=
    //可以读取或写入，但是有限制，均与面向对象相关
     */
}
