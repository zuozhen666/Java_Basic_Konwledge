package com.zuozhen.map;

import org.junit.Test;

import java.sql.Connection;
import java.util.*;

public class MapMethodTest {
    @Test
    public void test() {
        /*
        添加、删除、修改
         */
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
        //修改
        map.put("AA", 124);
        System.out.println(map);
        Map map1 = new HashMap();//{AA=124, BB=456, CC=789}
        map1.put("DD", 123);
        map1.put("CC", 456);
        map.putAll(map1);
        System.out.println(map);//{AA=124, BB=456, CC=456, DD=123}
        //删除
        System.out.println(map.remove("CC"));//456
        System.out.println(map.remove("adjahjd"));//null
        System.out.println(map);//{AA=124, BB=456, DD=123}
        //clear()
        map.clear();
        System.out.println(map.size());//0
        System.out.println(map);//{}
    }

    @Test
    public void test1() {
        /*
        元素查询
         */
        Map map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
        System.out.println(map.get("AA"));//123
        System.out.println(map.containsKey("AA"));//true
        System.out.println(map.containsValue(456));//true
        System.out.println(map.size());//3
        System.out.println(map.isEmpty());//false
        Map map1 = new HashMap();
        map1.put("AA", 123);
        map1.put("BB", 456);
        map1.put("CC", 789);
        System.out.println(map.equals(map1));//true
    }

    @Test
    public void test2() {
        /*
        元视图操作的方法
         */
        Map map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
        //所有的key
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }//AA
        //BB
        //CC
        //所有的value
        Collection values = map.values();
        for (Object obj : values) {
            System.out.println(obj);
        }//123
        //456
        //789
        //所有的key value
        Set entrySet = map.entrySet();
        for (Object obj : entrySet) {
            System.out.println(obj);
        }//AA=123
        //BB=456
        //CC=789
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }//同上
    }
}
