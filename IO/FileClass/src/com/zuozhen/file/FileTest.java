package com.zuozhen.file;

import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * File类的使用
 * File类的一个对象：代表一个文件或文件目录
 * java.io.File
 */
public class FileTest {
    /*
    1.创建File类实例：三种方式
    2.
    相对路径：
    绝对路径：包含盘符
     */
    @Test
    public void test1() {
        //构造器1
        File file1 = new File("hello.txt");//相对于当前module
        /*
        考虑不同系统的话可以使用File.separator作为分隔符
         */
        File file2 = new File("D:\\HUST-LIFE\\2021Spring\\JAVA_Basic_Knowledge\\IO\\FileClass\\hello.txt");//绝对路径

        System.out.println(file1);//hello.txt
        System.out.println(file2);//D:\HUST-LIFE\2021Spring\JAVA_Basic_Knowledge\IO\FileClass\hello.txt
        //构造器2
        File file3 = new File("D:\\HUST-LIFE\\2021Spring\\JAVA_Basic_Knowledge", "IO");
        System.out.println(file3);//D:\HUST-LIFE\2021Spring\JAVA_Basic_Knowledge\IO
        //构造器3
        File file4 = new File(file3, "FileClass\\hello.txt");
        System.out.println(file4);//D:\HUST-LIFE\2021Spring\JAVA_Basic_Knowledge\IO\FileClass\hello.txt
    }

    /*
    File类常用方法
     */
    @Test
    public void test2() {
        /*
        获取功能
         */
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\HUST-LIFE\\2021Spring\\JAVA_Basic_Knowledge\\IO\\FileClass\\hello.txt");

        //绝对路径
        System.out.println(file1.getAbsolutePath());//D:\HUST-LIFE\2021Spring\JAVA_Basic_Knowledge\IO\FileClass\hello.txt
        //路径
        System.out.println(file1.getPath());//hello.txt
        //名字
        System.out.println(file1.getName());//hello.txt
        System.out.println(file1.getParent());//null
        //长度
        System.out.println(file1.length());//10("helloworld")
        //最近修改时间
        System.out.println(new Date(file1.lastModified()));//Sat Jan 23 17:05:39 GMT+08:00 2021
    }

    @Test
    public void test3() {
        File file = new File("D:\\HUST-LIFE\\2021Spring\\JAVA_Basic_Knowledge");
        //以下方法适用于文件目录
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }//打印目录下的文件或文件目录的名字
        File[] files = file.listFiles();//同上，不过上面返回的是String型，而这为File型
    }

    @Test
    public void test4() {
        /*
        重命名
         */
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\hi.txt");

        boolean renameTo = file1.renameTo(file2);
        /*
        若想返回true，保证file1在硬盘里存在，file2在硬盘中不存在
        执行后hello.txt不存在，但hi.txt被创建出来了
         */
    }

    @Test
    public void test5() {
        /*
        判断方法
         */
        File file = new File("hello.txt");
        System.out.println(file.isDirectory());//false
        System.out.println(file.isFile());//true
        System.out.println(file.exists());//true
        System.out.println(file.canRead());//true
        System.out.println(file.canWrite());//true
        System.out.println(file.isHidden());//false
        //...
    }
    @Test
    public void test6(){
        /*
        创建方法
        boolean createNewFile();创建文件
        boolean mkdir();创建文件目录，如果上层不在，就创建失败
        boolean mkdirs();创建文件目录，如果上层不在，一并创建
        删除方法
        boolean delete();删除文件或文件夹
         */
    }
}
