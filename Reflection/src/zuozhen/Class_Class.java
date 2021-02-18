package zuozhen;

import org.junit.Test;

public class Class_Class {
    /*
    java.lang.Class
    Class类：
    程序经过javac.exe命令以后会生成一个或多个字节码文件(.class)，
    接着我们使用java.exe对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中，
    称为类的加载。加载到内存中的类，称为运行时类，此运行时类，称为Class的一个实例。

     即：Class的实例对应着一个运行时类
     */
    @Test
    public void test() throws ClassNotFoundException {
        /*
        获取Class实例的方式：（获取，而不是创建）
         */
        //方式一：调用运行时类的属性
        Class<Person> c1 = Person.class;
        //方式二：调用运行时类的对象
        Person p = new Person();
        Class c2 = p.getClass();
        System.out.println(c2);//class zuozhen.Person
        //（最常用：编译时不会报错）方式三：调用Class的静态方法 forName(String classPath)
        Class<?> c3 = Class.forName("zuozhen.Person");//全类名
        System.out.println(c3);//class zuozhen.Person
        //方式四：类的加载器（了解）《系统类加载器》
        ClassLoader classLoader = Class_Class.class.getClassLoader();
        Class c4 = classLoader.loadClass("zuozhen.Person");
        System.out.println(c4);//class zuozhen.Person
        /*
        Class实例的结构很广泛，如接口、注解、void、数组等
         */
    }
    /*
    类的加载过程：
    三个步骤：
    1.类的加载Load：将类的字节码文件读入内存，并将这些静态数据转换成方法区的运行时数据结构，
    然后生成一个java.lang.Class对象，作为方法区中类数据的访问入口（引用地址）。
    所有需要访问和使用类数据只能通过这个Class对象。这个类的加载过程需要类加载器参与。
    2.链接：
    3.初始化：
    类的加载器：
    将class文件字节码加载到内存，将静态数据转换成方法区的运行时数据结构，然后在堆中生成一个
    代表这个类的java.lang.Class对象，作为方法区中类数据的访问入口。
    标准的JavaSE类加载器可以按照要求查找类，但一旦某个类被加载到类加载器中，它将维持加载（缓存）
    一段时间，不过JVM垃圾回收机制可以回收这些Class对象。
     */
}
