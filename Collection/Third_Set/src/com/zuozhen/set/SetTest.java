package com.zuozhen.set;

import org.junit.Test;

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
     */
    @Test
    public void testSet() {

    }
}
