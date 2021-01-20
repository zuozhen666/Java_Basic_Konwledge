package com.zuozhen.collection;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 集合框架概述
 * <p>
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器
 * （此时的存储主要指的是内存层面的存储，不涉及到持久化层面）
 * <p>
 * 2.数组在存储多个数据方面的特点：
 * 》初始化后，长度确定
 * 》定义时需要指明元素的类型
 * 缺点：
 * 》初始化后长度无法修改
 * 》数组中提供的方法非常有限，增查删改不方便，效率不高
 * 》获取数组中实际元素个数的需求，没有现成的属性或方法可用
 * 》存储数据的特点：有序、可重复，对于无序、不可重复等需求不可满足
 * <p>
 * //集合框架
 * //一，Collection接口：单列数据，定义了存储一组对象的方法的集合
 * /---List接口：元素有序、可重复的集合  《“动态”数组》
 * /---ArrayList、LinkedList、Vector
 * <p>
 * /---Set接口：元素无序、不可重复的集合  《数学意义上的集合》
 * /---HashSet、LinkedHashSet、TreeSet
 * <p>
 * //二，Map接口：双列数据，保存具有映射关系“key-value对”的集合   《数学意义上的函数》
 * /---HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 */
public class CollectionTest {
    /*
    Collection接口中的常用方法

    向Collection接口的实现类的对象中添加数据obj时，要求obj所在类重写equals方法
     */

    @Test
    public void test4() {
        Collection coll = new ArrayList();
        coll.add(123);//包装类
        coll.add(456);
        coll.add(false);//包装类
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));
        Collection coll1 = Arrays.asList(123, 456, 666);
        //求交集
        System.out.println(coll.retainAll(coll1));//true
        System.out.println(coll);//[123, 456]
        //equals(Object obj)
        System.out.println(coll.equals(coll1));//false
        //hashCode()
        System.out.println(coll.hashCode());//计算当前对象哈希值
        //集合转换为数组toArray()
        Object[] objects = coll.toArray();
        for (Object obj : objects) {
            System.out.println(obj);
        }
        //数组转换为集合Arrays类的静态方法asList
        String[] arr = {"AA", "BB", "CC"};
        List<String> objects1 = Arrays.asList(arr);
        System.out.println(objects1);//[AA, BB, CC]
        System.out.println(objects1.size());//3
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);//包装类
        coll.add(456);
        coll.add(false);//包装类
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));
        //remove(Object obj)
        //也是调用equals方法，需要重写
        System.out.println(coll.remove(123));//true
        System.out.println(coll.contains(123));//false
        //removeAll(Collection coll1)
        //求差集
        Collection coll1 = Arrays.asList(123, 456, 666);
        System.out.println(coll.removeAll(coll1));//true

    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add(123);//包装类
        coll.add(456);
        coll.add(false);//包装类
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));
        //contains(Object obj)：判断当前集合是否包含obj
        //在判断时会调用obj对象所在类的equals方法
        System.out.println(coll.contains("Tom"));//true
        System.out.println(coll.contains(new String("Tom")));//true//说明调用的是equals
        System.out.println(coll.contains(new Person("Jerry", 20)));//false//如果有true的需求可以重写equals

        //containsAll(Collection coll1)：判断coll1中所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));//true
    }

    @Test
    public void test1() {
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
        //isEmpty()
        System.out.println(coll.isEmpty());//false
        //clear()
        coll.clear();
        System.out.println(coll.isEmpty());//true
    }
}
