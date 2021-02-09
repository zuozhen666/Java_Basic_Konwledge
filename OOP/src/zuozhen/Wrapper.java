package zuozhen;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import javax.xml.transform.Source;

/*
包装类：针对八种基本数据类型定义相应的引用类型

 */
public class Wrapper {
    @Test
    public void test1() {
        /*
        基本数据类型-》包装类，调用包装类的构造器
         */
        int num = 10;
        Integer integer = new Integer(num);
        System.out.println(integer);//10(Integer重写了toString方法)
        System.out.println(new Integer("123"));//123
        System.out.println(new Float("12.7"));//12.7
        System.out.println(new Boolean(true));//true
        System.out.println(new Boolean("True"));//true
        System.out.println(new Boolean("true123"));//false
    }

    @Test
    public void test2() {
        /*
        包装类-》基本数据类型：调用XxxValue()
         */
        Integer in1 = new Integer(21);
        int val = in1.intValue();
        System.out.println(val + 1);//22
    }

    /*
    jdk5.0加入新特性：
    1.自动装箱：
    2.自动拆箱：
     */
    @Test
    public void test3() {
        /*
        自动装箱与自动拆箱
         */
        Integer in1 = 21;
        System.out.println(in1 + 1);//22
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);//true
        System.out.println(j.equals(i));//true
    }

    @Test
    public void test4() {
        /*
        基本数据类型，包装类->String
         */
        int num = 10;
        //方式一
        String str = "" + num;
        //方式二(调用ValueOf)
        float f1 = 12.3f;
        String s = String.valueOf(f1);
        System.out.println(s);//12.3
    }

    @Test
    public void test5() {
        /*
        String->基本数据类型，包装类(调用parseXxx())
         */
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);//123
    }

    @Test
    public void test6() {
        /*
        面试题
         */
        Object obj = true ? new Integer(1) : new Double(2.0);//三元运算符，类型自动提升（编译时）
        System.out.println(obj);//1.0
        /*
        面试题
         */
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);//1
        /*
        面试题
         */
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        /*
        -128~127(内部类IntegerCache里有一个数组，包含了常用的数值，用于提升效率)
         */
        Integer x = 128;//相当于new了一个Integer对象
        Integer y = 128;
        System.out.println(x == y);//false
    }
}
