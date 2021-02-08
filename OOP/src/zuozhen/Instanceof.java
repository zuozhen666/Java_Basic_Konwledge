package zuozhen;

public class Instanceof {
    public static void main(String[] args) {
        Person p1 = new Man();//多态，编译时为Person，运行时为Man
        //局限：不能调用子类特有的方法
        //所以存在：向下转型的需求
        Man m1 = (Man) p1;
        m1.earnMoney();
        //存在风险
/*        Woman w1 = (Woman) p1;
        w1.goShopping();//会出现类型转换异常*/
//所以引入关键字：instanceof
        /*
        a instanceof A:判断对象a是否是类A的一个实例；如果是，返回true

        如果a instanceof A为true，B为A的父类，a instanceof B也为true
         */
        if(p1 instanceof Woman){//false,不会执行
            Woman w1 = (Woman) p1;
            w1.goShopping();
            System.out.println("test");
        }
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }
}

class Man extends Person {
    boolean isSmoking;

    public void earnMoney() {
        System.out.println("男人earnMoney");
    }

    public void eat() {
        System.out.println("男人吃饭");
    }
}

class Woman extends Person {
    boolean isBeauty;

    public void goShopping() {
        System.out.println("女人goShopping");
    }

    public void eat() {
        System.out.println("女人吃饭");
    }
}