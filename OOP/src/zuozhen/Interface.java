package zuozhen;

public class Interface {
    /*
    接口：
    1.java中接口和类是并列的两个结构
    2.可定义的成员：
        jdk7之前：全局常量和抽象方法
        即：public static final//public abstract
        jdk8:
        添加了静态方法，默认方法
    //如果实现类没有实现接口的所有抽象方法，那么该实现类为一个抽象类
    //接口与接口之间可以继承，且可以多继承
     */
    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(plane.MAX_SPEED);//7990
        /*
        匿名实现类
         */
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {

            }

            @Override
            public void stop() {

            }
        };
    }
}

interface Flyable {
    public static final int MAX_SPEED = 7990;
    int MIN_SPEED = 1;//省略了public static final

    public abstract void fly();

    void stop();//省略了public abstract
}

class Plane implements Flyable {
    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}
