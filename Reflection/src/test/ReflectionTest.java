package test;

import entity.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    /*
    调用运行时类指定的结构：属性、方法、构造器
     */
    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class c = Person.class;
        //创建运行时类对象
        Person person = (Person) c.newInstance();
        //获取指定属性,getField(要求声明为public)通常不采用
        Field id = c.getField("id");
        //设置属性值
        id.set(person, 1001);
        //获取属性值
        int pId = (int) id.get(person);
    }

    @Test
    public void test1() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class c = Person.class;
        Person person = (Person) c.newInstance();
        //获取指定变量名的属性
        Field name = c.getDeclaredField("name");
        //保证当前属性可访问
        name.setAccessible(true);
        name.set(person, "Tom");
        Object o = name.get(person);
    }

    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Person.class;
        Person person = (Person) c.newInstance();
        /*
        获取指定方法
        参数一：方法名
        参数二：形参列表
         */
        Method show = c.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        //调用
        //invoke方法的返回值即为类中方法的返回值
        Object invoke = show.invoke(person, "China");//国籍：China
        System.out.println(invoke);//China
        /*
        静态方法
         */
        Method staticFucTest = c.getDeclaredMethod("staticFucTest");
        staticFucTest.setAccessible(true);
        //第一个参数为当前类，而不是实例化的对象（无返回值的话返回null）
        staticFucTest.invoke(c);//test succeed
        //也可以不指明当前类
        staticFucTest.invoke(null);//test succeed
    }

    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        调用指定构造器(不通用)
         */
        Class c = Person.class;
        Constructor declaredConstructor = c.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Person james = (Person) declaredConstructor.newInstance("James");
        System.out.println(james);//Person{name='James', age=0, id=0}
    }
}
