package com.zuozhen.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public void test1(){
        //实例化时没有指明类的泛型，默认为Object
        //要求：最好都要在实例化时指明泛型的类型
        Order order = new Order();
        order.setOrderT(123);

        Order<String> order1 = new Order<>("AA","BB",123);
        System.out.println(order1);
    }
}
