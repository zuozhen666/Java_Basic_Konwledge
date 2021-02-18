package test;

import entity.Person;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import sun.security.action.GetBooleanAction;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest {
    /*
    获取构造器结构
     */
    @Test
    public void test() {
        Class c = Person.class;
        Constructor[] constructors = c.getConstructors();//当前运行时类中声明为public的构造器
        for (Constructor con : constructors) {
            System.out.println(con);
        }
        System.out.println();
        Constructor[] declaredConstructors = c.getDeclaredConstructors();//当前运行时类中声明的所有构造器
        //...
    }

    /*
    获取运行时类的父类
     */
    @Test
    public void test1() {
        Class c = Person.class;
        Class superC = c.getSuperclass();
        System.out.println(superC);//class entity.Creature
        Type genericSuperclass = c.getGenericSuperclass();//带泛型的父类
        System.out.println(genericSuperclass);//entity.Creature<java.lang.String>
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0]);//class java.lang.String
    }

    /*
    获取运行时类实现的接口
     */
    @Test
    public void test2() {
        Class c = Person.class;
        Class[] interfaces = c.getInterfaces();//当前运行时类实现的接口（无父类）
    }

    /*
    获取运行时类所在的包
     */
    @Test
    public void test3() {
        Class c = Person.class;

        Package aPackage = c.getPackage();
        System.out.println(aPackage);//package entity
    }

    /*
    获取运行时类注解
     */
    @Test
    public void test4() {
        Class c = Person.class;
        Annotation[] annotations = c.getAnnotations();
        //...
    }
}
