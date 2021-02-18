package test;

import entity.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest {
    /*
    获取运行时类的方法结构
     */
    @Test
    public void test() {
        Class c = Person.class;
        Method[] methods = c.getMethods();//当前运行时类及父类声明为public的方法
//        for (Method m : methods) {
//            System.out.println(m);
//        }
        Method[] declaredMethods = c.getDeclaredMethods();//当前运行时类中声明的所有方法（无父类）
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }

    @Test
    public void test1() {
        /*
        @注解
        权限修饰符，返回值类型，方法名（参数类型。。。） throws XxxException{}
         */
        Class c = Person.class;
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m : declaredMethods) {
            //1.获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                System.out.print(a + "\t");
            }
            //2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");
            //3.返回值类型
            System.out.print(m.getReturnType() + "\t");
            //4.方法名
            System.out.print(m.getName() + "(");
            //5.形参
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (parameterTypes == null && parameterTypes.length == 0) {
            } else {
                for (int i = 0; i < parameterTypes.length; i++) {
                    System.out.print(parameterTypes[i].getName() + " args_" + i);
                    if (i != parameterTypes.length - 1) {
                        System.out.print(",");
                    }
                }
            }
            System.out.print(")");
            //6.异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            //...同上
            System.out.println();
        }
    }
}
