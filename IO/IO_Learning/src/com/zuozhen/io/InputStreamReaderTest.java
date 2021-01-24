package com.zuozhen.io;

import org.junit.Test;

import java.io.*;

/*
处理流-》转换流
提供字节流与字符流之间的转换
InputStreamReader//字符流：将一个字节的输入流转换成字符的输入流
OutputStreamWriter//字符流：将一个字符的输出流转换成字节的输出流
 */
public class InputStreamReaderTest {
    @Test
    public void test() {
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream(new File("hello.txt"));
            isr = new InputStreamReader(fis, "UTF-8");

            char[] buffer = new char[3];
            int len;
            while ((len = isr.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    需求：换一个字符编码方式
     */
    @Test
    public void test1() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File srcFile = new File("hello.txt");
            File distFile = new File("hello_gbk.txt");
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(distFile);
            isr = new InputStreamReader(fis, "utf-8");
            osw = new OutputStreamWriter(fos, "gbk");
            char[] buffer = new char[3];
            int len;
            while ((len = isr.read(buffer)) != -1) {
                osw.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null)
                    osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
