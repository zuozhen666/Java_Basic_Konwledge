package com.zuozhen.stringlearning;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import javax.sound.midi.Soundbank;

public class StringMethodTest {
    @Test
    public void test4(){
        String s1 = "湖人总冠军";
        String s2 = s1.replace('人','队');//替换
        String s3 = s1.replace("湖人","篮网");
        System.out.println(s2);
        System.out.println(s3);
        String str = "123hello456world789";
        //跟正则表达式相关
        //数字替换成","
        String str2 = str.replaceAll("\\d+",",");
        //去掉首尾","
        String str3 = str2.replaceAll("^,|,$","");
        System.out.println(str2);//,hello,world,
        System.out.println(str3);//hello,world
        //判断字符串是否全部由数字组成
        String str4 = "123";
        boolean matches = str4.matches("\\d+");
        System.out.println(matches);//true
        String tel = "0571-12345676";
        matches = tel.matches("0571-\\d{7,8}");
        System.out.println(matches);//true

        String temp = "hello,world,java";
        String[] strs = temp.split("\\,");//切割
        for(String tmp: strs){
            System.out.println(tmp);
        }
    }

    @Test
    public void test3() {
        String s1 = "helloworld";
        boolean b1 = s1.endsWith("ld");//是否以“ld”结尾
        System.out.println(b1);//true
        boolean b2 = s1.startsWith("he");//是否以“he”开始
        System.out.println(b2);//true
        boolean b3 = s1.startsWith("ll", 2);//从位置2开始
        System.out.println(b3);//true
        System.out.println(s1.contains("he"));//是否包含//true

        System.out.println(s1.indexOf("lo"));//输出索引//3//没找到返回-1
        System.out.println(s1.indexOf("lo", 5));//从5开始找//-1
        System.out.println(s1.lastIndexOf("or"));//从后往前找//6
        System.out.println(s1.lastIndexOf("or", 5));//-1
        //indexOf(str)与lastIndexOf(str)返回值相同
        //1.存在唯一str
        //2.不存在str
    }

    @Test
    public void test2() {
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写//true

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);//连接//abcdef

        String s5 = "abc";
        String s6 = new String("abC");
        System.out.println(s5.compareTo(s6));//比较大小//32
        System.out.println(s5.compareToIgnoreCase(s6));//0

        //左闭右开
        System.out.println(s1.substring(5));//World
        System.out.println(s1.substring(0, 5));//Hello
    }

    @Test
    public void test1() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());//10
        System.out.println(s1.charAt(1));//取特定位置上的字符//e
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.toUpperCase());//转换为大写//HELLOWPRLD
        System.out.println(s1.toLowerCase());//转换为小写//helloworld

        String s2 = "  hello  world  ";
        System.out.println(s2.trim());//去除原来字符串首尾空格//hello  world

    }
}
