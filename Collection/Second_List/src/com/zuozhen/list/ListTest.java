package com.zuozhen.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * //一，Collection接口：单列数据，定义了存储一组对象的方法的集合
 * /---List接口：元素有序、可重复的集合  《“动态”数组》
 * /---ArrayList、LinkedList、Vector
 * 三个具体实现类的异同：
 * 同：三个类都实现了List接口，存储数据的特点相同：有序，重复
 * 不同：
 * ArrayList：作为接口的主要实现类，线程不安全，效率高；底层使用Object[] elementData存储
 * LinkedList：对于频繁的插入和删除操作，使用此类比ArrayList效率高，底层使用的双向链表存储
 * Vector：作为接口的古老实现类，线程安全，效率低；底层使用Object[] elementData存储
 */
public class ListTest {
    @Test
    public void testArrayList() {
        /*
        //ArrayList源码分析
        //jdk7
        ArrayList list = new ArrayList();//创建了长度为10的Object[]数组elementData
        list.add(123);//elementData[0]=123;
        ...
        list.add(xxx);//如果此时添加导致容量不够，即扩容，默认情况新造数组为原容量1.5倍，然后数组复制
        结论：建议在实际开发中使用带参构造器，效率会高一些
        //jdk8
        ArrayList list = new ArrayList();//底层elementData初始化为{}，并没有创建长度为10的数组
        list.add(xxx);//第一次调用添加操作，底层才创建数组，后续操作与jdk7相同
        //小结：jdk8中的ArrayList对象的创建延迟了数组的创建，节省了内存
         */
    }

    @Test
    public void testLinkedList() {
        /*
        //LinkedList源码分析

        LinkedList linkedList = new LinkedList();//内部声名了Node类型的first和last属性，默认值为null
        linkedList.add(123);//将123封装到Node中，创建了Node对象

        Node定义为：
        private static class Node<E> {
            E item;
            LinkedList.Node<E> next;
            LinkedList.Node<E> prev;

            Node(LinkedList.Node<E> prev, E element, LinkedList.Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }
         */
    }

    @Test
    public void testVector() {
        /*
        Vector jdk7/jdk8 Verctor()构造器创建时与ArrayList相同，扩容时为原容量的2倍
        用的极少，了解即可
         */
    }

    /*
    List接口中的常用方法
    增：add(Object obj)
    删：remove(int index)/remove(Object obj)
    改：set(int,Object)
    查：get(int)
    插：add(int,Object)
    长度：size()
    遍历：1.Iterator   2.for each  3.for
     */
    @Test
    public void testMethod() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("aa");
        list.add(456);
        System.out.println(list);
        //add(int,Object)：在int位置插入Object元素
        list.add(1, "bb");
        System.out.println(list);
        //get(int index)
        System.out.println(list.get(0));//123
        //indexOf(Object obj)
        System.out.println(list.indexOf(456));//2
        //LastIndexOf(Object obj)
        System.out.println(list.lastIndexOf(456));//4
        //Object remove(int index)：重载remove(Object obj)，移除后返回此元素
        //Object set(int index,Object obj)//返回的是原来的元素
        System.out.println(list.set(0, 456));//123
        System.out.println(list);
        //List subList(int fromIndex, int toIndex)//左闭右开
        System.out.println(list.subList(0, 3));//[456, bb, 456]
    }
}
