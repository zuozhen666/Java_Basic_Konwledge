package test;

import entity.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
获取当前运行时类的属性结构
 */
public class FieldTest {
    @Test
    public void test() throws ClassNotFoundException {
        // Class c = Class.forName("entity.Person");
        Class c = Person.class;
        //获取属性结构
        /*
        获取当前运行时类及其父类中声明为public访问权限的属性（默认访问权限不行）
         */
        Field[] fields = c.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        /*
        获取当前运行时类声明的所有属性（无权限限制，不包含父类声明的属性）
         */
        Field[] declaredFields = c.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
    }

    @Test
    public void test1() {
        Class c = Person.class;
        Field[] declaredFields = c.getDeclaredFields();
        for (Field f : declaredFields) {
            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");
            //2.数据类型
            Class<?> type = f.getType();
            System.out.print(type.getName() + "\t");
            //3.变量名
            System.out.println(f.getName());
        }
    }
}
