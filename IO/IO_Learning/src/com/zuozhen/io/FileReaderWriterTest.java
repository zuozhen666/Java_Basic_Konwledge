package com.zuozhen.io;

import com.sun.corba.se.impl.resolver.FileResolverImpl;
import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());//D:\HUST-LIFE\2021Spring\JAVA_Basic_Knowledge\IO\hello.txt
    }

    @Test
    public void test1() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");//相较于当前module
            //System.out.println(file.getAbsolutePath());//D:\HUST-LIFE\2021Spring\JAVA_Basic_Knowledge\IO\IO_Learning\hello.txt
            //提供具体的流
            fr = new FileReader(file);
            //数据读入
            //read():返回读入的字符，如果到达文件末尾，返回-1
            int read;
            while ((read = fr.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流的关闭
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //对read()重载方法的使用
    @Test
    public void test2() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

            /*
            read(char[] cbuf)返回每次读入的字符个数
             */
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
//                for (int i = 0; i < len; i++) {//不能用cbuf.length
//                    System.out.print(cbuf[i]);
//                }
                //方式二：
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test3() throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
        /*
        读入与写出
         */
            File srcFile = new File("hello.txt");
            File destFile = new File("hell02.txt");

            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            char[] cbuf = new char[3];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
