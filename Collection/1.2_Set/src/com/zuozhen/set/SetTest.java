package com.zuozhen.set;

import org.junit.Test;

import java.util.HashSet;

/**
 * //一，Collection接口：单列数据，定义了存储一组对象的方法的集合
 * * /---Set接口：元素无序、不可重复的集合  《数学意义上的集合》
 * /---HashSet、LinkedHashSet、TreeSet
 * <p>
 * HashSet:主要实现类，线程不安全，可以存储null值
 * LinkedHashSet:HashSet的子类，遍历其内部数据时可以按照添加的顺序遍历
 * TreeSet:可以按照添加对象的指定属性进行排序
 */
public class SetTest {
    /*
    Set(没有定义额外的新的方法（相对于Collection），无索引)
    以HashSet说明
    1.无序性：不等于随机性；存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值
    2.不可重复性：根据equals()来判断

    //添加元素，HashSet（数组+链表）
    1.hashCode计算哈希值
    2.通过某种算法计算出元素在底层数组的存放位置
    3.如果此位置没有其他元素，则元素添加成功；
    如果有其他元素（或以链表形式存在的多个元素），比较哈希值
        哈希值不同，添加成功
        哈希值相同，调用要添加元素的equals方法
            true，添加失败
            false，添加成功

     //要求：添加元素所在类要重写hashCode和equals方法，尽可能保持一致性，即相同对象必须具有相同的散列码
     技巧：equals里用到的属性在hashCode里也用一下
     */
    @Test
    public void testLinkedHashSet() {
/*
LinkedHashSet：是HashSet的子类，在添加数据的同时，
每个数据还维护了两个引用记录前一个数据以及后一个数据（双链表打散？）
对于频繁的遍历操作，LinkedHashSet效率高于HashSet
 */
    }

    @Test
    public void testTreeSet() {
        /*
        //TreeSet
        1.向TreeSet中添加的数据必须是相同类的对象
        2.两种排序方式：自然排序，定制排序
        3.自然排序：
        （TreeSet中的比较是否相同的方式不是equals，而是排序用的函数compareTo）
        4.定制排序：在构造TreeSet的时候加上Comparetor参数（比较是否相同类似上）
         */
    }

    //Question
    @Test
    public void question() {
        HashSet set = new HashSet();
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Jack", 13);

        set.add(p1);
        set.add(p2);
        System.out.println(set.size());//2
        p1.name = "YanRui";
        set.remove(p1);
        System.out.println(set.size());//2//remove计算哈希值后，哈希值对应的位置不是原p1的位置
        set.add(new Person("YanRui", 12));//同上
        System.out.println(set.size());//3
        set.add(new Person("Tom", 12));
        System.out.println(set.size());//4

    }
}
