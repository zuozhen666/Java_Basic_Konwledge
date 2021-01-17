package com.zuozhen.datetime;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/*
日历类Calendar抽象类
 */
public class CalendarTest {
    @Test
    public void test() {
        //实例化
        //1.创建其子类的对象
        //2.调用它的静态方法//两种方法都是一样的，最终均为java.util.GregorianCalendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());//class java.util.GregorianCalendar
        //常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);//这一月的第几天
        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 22);//修改的是calender对象本身
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);//22
        //add()
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);//25
        //getTime():日历类->Date
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime():Date->日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
