package com.zuozhen.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 集合框架概述
 *
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器
 *  （此时的存储主要指的是内存层面的存储，不涉及到持久化层面）
 *
 * 2.数组在存储多个数据方面的特点：
 * 》初始化后，长度确定
 * 》定义时需要指明元素的类型
 * 缺点：
 * 》初始化后长度无法修改
 * 》数组中提供的方法非常有限，增查删改不方便，效率不高
 * 》获取数组中实际元素个数的需求，没有现成的属性或方法可用
 * 》存储数据的特点：有序、可重复，对于无序、不可重复等需求不可满足
 *
 * //集合框架
 * //一，Collection接口：单列数据，定义了存储一组对象的方法的集合
 *      /---List接口：元素有序、可重复的集合  《“动态”数组》
 *          /---ArrayList、LinkedList、Vector
 *
 *      /---Set接口：元素无序、不可重复的集合  《数学意义上的集合》
 *          /---HashSet、LinkedHashSet、TreeSet
 *
 * //二，Map接口：双列数据，保存具有映射关系“key-value对”的集合   《数学意义上的函数》
 *          /---HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 */
public class CollectionTest {
    /*
    Collection接口中的常用方法
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        Collection coll1 = new ArrayList();
        //add(Object e)
        coll.add("AA");
        coll.add(123);
        coll.add(new Date());
        //size()
        System.out.println(coll.size());//3
        //addAll(Collection c)
        coll1.add("bb");
        coll1.add("cc");
        coll.addAll(coll1);
        System.out.println(coll.size());//5
    }
}
