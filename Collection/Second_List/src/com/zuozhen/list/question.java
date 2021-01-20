package com.zuozhen.list;

import java.util.ArrayList;
import java.util.List;

public class question {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    public static void updateList(List list) {
        //list.remove(2);//考察两个remove
        list.remove(new Integer(2));
    }
}
