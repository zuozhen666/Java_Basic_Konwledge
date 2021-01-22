package com.zuozhen.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 * 2.TreeMap：可以按照添加的键值对进行排序，实现排序遍历（按照key(同一个类)）
 * //自然排序与定制排序（写进TreeMap构造器参数）均可
 * 底层：红黑树
 */
public class TreeMapTest {
    @Test
    public void test(){
        TreeMap map = new TreeMap();
        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Uu",25);
        Person p3 = new Person("Jack",45);
        map.put(p1,100);
        map.put(p2,70);
        map.put(p3,80);
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
