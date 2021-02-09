package zuozhen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AbstractClass {
    /*
    父类设计的非常抽象，以至于没有具体的实例，这样的类叫做抽象类。
    abstract可以修饰的结构：类、方法
    1.修饰的类：不可被实例化，抽象类中一定有构造器（便于子类对象实例化）
    2.修饰的方法：只有方法的声明，没有方法体，子类继承后要重写抽象方法（如果子类不是抽象类的话）
    //包含抽象方法的类一定是抽象类，抽象类不一定包含抽象方法
    //abstract不能修饰私有方法，静态方法，final方法，final类
     */
    public static void main(String[] args) {
        //抽象类的匿名子类(无需提前写好子类)
        Aperson p = new Aperson() {
            @Override
            public void walk() {
                System.out.println("walk");
            }
        };
        p.eat();//eat
        System.out.println(p.getClass());//class zuozhen.AbstractClass$1
    }
}

abstract class Aperson {
    String name;
    int age;

    public void eat() {
        System.out.println("eat");
    }
    //抽象方法
    public abstract void walk();

    public Aperson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Aperson() {
    }
}

class Student extends Aperson {
    public Student(String name, int age) {
    super(name, age);
}

    @Override
    public void walk() {
        System.out.println("walk");
    }
}