package com.zuozhen.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历：Iterator接口
 */
public class IteratorTest {
    /*
    Iterator
     */
    @Test
    public void test() {
        Collection coll = new ArrayList();
        coll.add(123);//包装类
        coll.add(456);
        coll.add(false);//包装类
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));

        Iterator iterator = coll.iterator();
        //方式一
//        System.out.println(iterator.next());//123
//        System.out.println(iterator.next());//456
//        System.out.println(iterator.next());//false
//        System.out.println(iterator.next());//Tom
//        System.out.println(iterator.next());//Person{name='Jerry', age=20}
        //方式二
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }
        //方式三，推荐使用
        while (iterator.hasNext()) {//判断是否还有下一个元素
            System.out.println(iterator.next());//指针下移，将下移后的集合位置上的元素返回
        }
    }
}
