package zuozhen;

/*
关键字：
 */
public class Keys {
    /*
    static：可以修饰属性，方法，代码块，内部类
    //
    栈：局部变量
    堆：new出来的结构：对象、数组
    方法区：类的加载信息、静态域、常量池
    //
    静态方法：
    随着类的加载而加载；
    通过类和对象均可以调用；
    在静态的方法内不能使用this,super关键字，所以不能使用实例变量为参数，或者使用实例变量；
    //
    经验：如何选取static
    属性：可以被多个对象共享，不会随着对象的不同而不同
    方法：操作静态属性的方法//工具类中的方法，例如Math，Arrays，Collections
     */
    /*
    final关键字：
    可以用来修饰类，方法，变量
    final修饰的类：不可被继承，例如String等。
    final修饰的方法：不可被子类重写，如Object中的getClass()；
    final修饰的属性：相当于常量，初始化后不可改（显式初始化，代码块初始化，构造器初始化）；
    final修饰的变量：局部变量（不可变）形参（不可变）
     */
}

/*
Singleton单例设计模式：对某个类只能存在一个对象实例
//饿汉式
 */
class Bank {
    //1.私有化类的构造器
    private Bank() {

    }

    //2.内部创建类的对象(静态)
    private static Bank instance = new Bank();

    //3.提供公共方法返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}

//懒汉式(什么时候用什么时候造对象)
class Order {
    //1.私有化类的构造器
    private Order() {

    }

    //2.声明当前类的对象，没有初始化
    private static Order instance;

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
