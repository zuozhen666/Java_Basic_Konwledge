package zuozhen;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    /*
    反射机制允许程序在执行期间借助于Reflection API取得任何类的内部信息，
    并能直接操作任意对象的内部属性及方法。
     */
    @Test
    public void test1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class c = Person.class;
        Constructor constructor = c.getConstructor(String.class, int.class);
        Object tom = constructor.newInstance("Tom", 12);
        System.out.println(tom);//Person{name='Tom', age=12}
        //通过反射可以调用私有属性、方法
        //...
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(tom, 10);
        System.out.println(tom);//Person{name='Tom', age=10}
        Method show = c.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(tom);//i'm a person
    }

}
