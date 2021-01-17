package com.zuozhen.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/*
Comparable/Comparator
简单对比：
Comparable：类去实现接口，一劳永逸
Comparator：临时实现
 */
public class CompareTest {
    /*
    Comparable接口使用举例：自然排序
    1.像String、包装类等实现了Comparable接口，重写了compareTo方法
    2.重写compareTo(obj)的规则：
    this小于obj，返回负整数；
    this等于obj，返回零；
    this大于obj，返回正整数。
    3.对于自定义类，如果需要排序，可以让自定义类实现Comparable接口，重写compareTo(obj)方法
     */
    @Test
    public void test1() {
        String[] arr = {"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovo", 34);
        arr[1] = new Goods("dell", 43);
        arr[2] = new Goods("mi", 12);
        arr[3] = new Goods("huawei", 65);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    Comparator：定制排序
    1.背景
    当元素的类型没有实现Comparable接口而又不方便修改代码；
    或者实现的Comparable接口的排序规则不适合当前的逻辑；
    那么可以考虑Comparator
    2.重写compare(obj1,obj2)
     */
    @Test
    public void test(){
        String[] arr = {"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.parallelSort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);//从大到小
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovo", 34);
        arr[1] = new Goods("dell", 43);
        arr[2] = new Goods("mi", 12);
        arr[3] = new Goods("huawei", 65);
        Arrays.sort(arr, new Comparator<Goods>() {
            //按照产品名称从低到高，再按照价格从高到低
            @Override
            public int compare(Goods o1, Goods o2) {
                if(o1.getName().equals(o2.getName())){
                    return -Double.compare(o1.getPrice(),o2.getPrice());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
