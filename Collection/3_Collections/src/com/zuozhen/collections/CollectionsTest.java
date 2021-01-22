package com.zuozhen.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Collections：操作Collection、Map的工具类，均为静态方法

Collection与Collections的区别？

 */
public class CollectionsTest {
    @Test
    public void test() {
        List list = new ArrayList();
        list.add(123);
        list.add(12);
        list.add(-23);
        list.add(103);
        list.add(3);
        list.add(783);
        //System.out.println(list);
        //Collections.reverse(list);//翻转
        //System.out.println(list);
        //Collections.shuffle(list);//随机化
        //System.out.println(list);
        //Collections.sort(list);//排序
        //Collections.swap(list,int,int);//交换
        //...
        //copy()//标准写法
        List dist = Arrays.asList(new Object[list.size()]);
        Collections.copy(dist, list);
        System.out.println(dist);
        /*
        Collections；类中提供了多个synchronizedXxx()方法，可以将指定集合包装成线程同步的集合
         */
    }
}
