package zuozhen;

public class ObjectTest {
    /*
    所有java类的根父类
    默认java.lang.Object

     */
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getClass().getSuperclass());//class java.lang.Object
    }
}

class Test {

}
