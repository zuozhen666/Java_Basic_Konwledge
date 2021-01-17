package com.zuozhen.datetime;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/*

 */
public class JDK8NewAPITest {

    @Test
    public void testDate() {
        //偏移量问题，局限性之一
        Date date1 = new Date(2020 - 1900, 9 - 1, 8);
        System.out.println(date1);
    }

    /*
    LocalDate,LocalTime,LocalDateTime使用
     */
    @Test
    public void test() {
        //实例化
        //now()：当前
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        //of()：指定
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime1);
        //getXxx()得到
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMonth());
        //withXxx()设置
        //不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);
        //plusXxx()添加   minusXxx()减少
        //不可变性
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
    }

    /*
    Instant
    类似于java.util.Date
     */
    @Test
    public void test2() {
        /*
        实例化
         */
        //本初子午线时间
        Instant now = Instant.now();
        System.out.println(now);//格林威治时间
        //添加时间的偏移量
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //获取时间戳，毫秒数
        long toEpochMilli = now.toEpochMilli();
        System.out.println(toEpochMilli);
        //实例化方式2
        Instant instant = Instant.ofEpochMilli(1610864005652L);
        System.out.println(instant);
    }

    /*
    DateTimeFormatter:格式化或解析日期时间
     */
    @Test
    public void test3() {
        //方式一：预定义的标准格式
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String str = formatter.format(localDateTime);
        System.out.println(str);
        //解析
        TemporalAccessor parse = formatter.parse("2021-01-17T14:18:41.615");
        System.out.println(parse);
        //方式二：本地化相关的格式ofLocalizedDateTime()/ofLocalizedDate()
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String str2 = dateTimeFormatter.format(localDateTime);
        System.out.println(str2);
        //常用//方式三：自定义的格式
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str3 = dateTimeFormatter1.format(localDateTime);
        System.out.println(str3);
    }
}
