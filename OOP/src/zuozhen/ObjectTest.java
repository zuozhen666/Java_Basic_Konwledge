package zuozhen;
/*
==与equals()
//==，运算符
1.可以使用在基本数据类型和引用数据类型变量中
2.如果比较的是基本数据类型变量，则比较两个变量保存数据是否相等（类型不一定相同）
3.如果比较的是引用数据类型变量，比较两个对象地址值是否相同
//equals()方法
1.只适用于引用数据类型
2.Object类中定义的equals方法和“==”作用相同
3.String,Date,File,包装类等都重写了equals()方法，重写后比较的是两个对象的“内容”是否相同
 */
/*
toString()
//当输出一个对象的引用时，实际上就是调用toString()方法
 */
public class ObjectTest {
    /*
    所有java类的根父类
    默认java.lang.Object

     */
    public static void main(String[] args) {
        TestO test = new TestO();
        System.out.println(test.getClass().getSuperclass());//class java.lang.Object
    }
}

class TestO {

}
