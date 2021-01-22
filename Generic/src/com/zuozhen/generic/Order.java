package com.zuozhen.generic;

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
}
