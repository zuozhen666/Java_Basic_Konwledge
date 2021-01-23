package com.zuozhen.generic;

import java.util.ArrayList;
import java.util.List;

/*
 * 泛型结构-》泛型类、接口；
 */
public class Order<T> {
    T orderT;
    String orderName;
    int orderId;

    public Order() {
    }

    public Order(T orderT, String orderName, int orderId) {
        this.orderT = orderT;
        this.orderName = orderName;
        this.orderId = orderId;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderT=" + orderT +
                ", orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                '}';
    }

    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //泛型方法所属的类是不是泛型类都没有关系
    //不同于泛型类，泛型方法可以声名为静态
    public <E> List<E> copyFromArrayToList(ArrayList<E> arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
