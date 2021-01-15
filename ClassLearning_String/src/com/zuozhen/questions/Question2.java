package com.zuozhen.questions;

import org.junit.Test;

public class Question2 {
    /*
    将一个字符串中的指定部分进行反转
    way1:借助char[]
     */
    public String reverse(String str, int startIndex, int endIndex) {
        char[] arr = str.toCharArray();
        for (int i = startIndex, j = endIndex; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    //way2:使用String的拼接，效率太低
    public String reverse1(String str, int startIndex, int endIndex) {
        String reverseStr = str.substring(0, startIndex);
        for (int i = endIndex; i >= startIndex; i--) {
            reverseStr += str.charAt(i);
        }
        reverseStr += str.substring(endIndex + 1);
        return reverseStr;
    }

    //way3:使用StringBuffer/StringBuilder优化
    public String reverse2(String str, int startIndex, int endIndex) {
        StringBuilder builder = new StringBuilder(str.length());
        builder.append(str.substring(0, startIndex));
        for (int i = endIndex; i >= startIndex; i--) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endIndex + 1));
        return builder.toString();
    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);
        System.out.println(reverse);
    }
}
