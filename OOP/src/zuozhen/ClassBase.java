package zuozhen;

/*
类的成员：属性，方法，构造器，代码块，内部类
 */
public class ClassBase {
    public static void main(String[] args) {
        String desc = Human.desc;//Hello,static block
        Human human = new Human();//hello, block
        System.out.println(human.age);//1
    }
    /*
    内部类：
    1.成员内部类（静态，非静态），局部内部类（方法内，代码块内，构造器内）
     */
}

class Human {
    //属性
    String name;
    int age;
    static String desc = "I'm a person";

    //构造器
    public Human() {

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*
    代码块：（初始化块）
    1.作用：用来初始化类、对象
    只能用static来修饰
    2.static修饰：静态代码块
    3.无static修饰：非静态代码块
     */
    //随着对象的创建而执行（多次）
    {
        System.out.println("hello, block");
        age = 1;
    }
    //随着类的加载而执行（一次）
    static {
        System.out.println("Hello,static block");
    }

    //方法
    public void eat() {
        System.out.println("eat");
    }

    public static void run() {
        System.out.println("run");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
