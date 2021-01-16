package com.zuozhen.questions;

import org.junit.Test;

public class Question4 {
    /*
    获取两个字符串中的最大相同字串
    str1="abcwerthelloyuiodef";str2="cvhellobnm"
    //局限：只能获取一个
     */

    public String getMaxSameString(String str1, String str2) {
        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() <= str2.length()) ? str1 : str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for (int x = 0, y = length - i; y <= length; x++, y++) {
                String subStr = minStr.substring(x, y);
                if (maxStr.contains(subStr)) {
                    return subStr;
                }
            }
        }
        return null;
    }

    @Test
    public void test() {
        String str1 = "bcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        System.out.println(getMaxSameString(str1, str2));
    }
}
