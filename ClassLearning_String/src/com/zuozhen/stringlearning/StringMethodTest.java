package com.zuozhen.stringlearning;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import javax.sound.midi.Soundbank;

public class StringMethodTest {

    @Test
    public void test2(){
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
        System.out.println(s1.substring(0,5));//Hello
    }

    @Test
    public void test1(){
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
