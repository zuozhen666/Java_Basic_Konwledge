package com.zuozhen.io;

import com.sun.media.sound.SoftLowFrequencyOscillator;
import org.junit.Test;

import java.io.*;

/*
处理流-》缓冲流的使用
BufferedInputStream
BufferedOutPutStream
BufferedReader
BufferedWriter
//可以调高流的读取、写入的速度
 */
public class BufferedTest {
    @Test
    public void test1() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //文件
            File srcFile = new File("hello.txt");
            File distFile = new File("hello1.txt");
            //节点流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(distFile);
            //缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[3];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            //要求：先关闭外层的流，再关闭内层的流
            //关闭外层时，内层自动关闭，所以内层关闭可省略
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        fos.close();
//        fis.close();
        }
    }
}
