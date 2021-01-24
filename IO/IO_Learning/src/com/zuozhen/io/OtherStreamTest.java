package com.zuozhen.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
其他流：
1.标准输入输出流
2.打印流
3.数据流
 */
public class OtherStreamTest {
    /*
    标准输入输出流
    System.in   默认键盘输入
    System.out  默认控制台输出

    setIn(InputStream is)/setOut(OutputStream os)方式重新指定输入和输出的流
     */
    /*
    练习：从键盘输入字符串，将整行字符转换成大写输出，然后继续输入
    直至输入“e”或者“exit”退出
    way1：Scanner，next()返回字符串
    way2：System.in--->转换流-->缓冲流 readLine()
     */

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true) {
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {//字符串常量写在前面，避免空指针
                    break;
                }

                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*
    打印流：
    PrintStream//字节输出流
    PrintWriter//字符输出流
     */
    /*
    数据流
    DataInputStream
    DataOutputStream
    操作基本数据类型和String
     */
}
