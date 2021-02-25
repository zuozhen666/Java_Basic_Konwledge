package zuozhen;

import org.junit.Test;
import zuozhen.FunctionalInterfaces.*;

public class BasicSyntax {
    @Test
    public void test() {
        //1.实现无参无返回值的函数式接口
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("none return none parameter");
        };
        lambda1.test();
        //2.实现一个参数无返回值的函数式接口
        NoneReturnOneParameter lambda2 = (int a) -> {
            System.out.println("none return one parameter " + a);
        };
        lambda2.test(2);
        //3.多个参数无返回值
        NoneReturnMutipleParameter lambda3 = (int a, int b) -> {
            System.out.println("none return mutiple parameter " + a + " " + b);
        };
        lambda3.test(3, 3);
        //4.无参有返回值
        SingleReturnNoneParameter lambda4 = () -> {
            System.out.print("single return none parameter ");
            return 4;
        };
        int ret4 = lambda4.test();
        System.out.println("ret4 = " + ret4);
        //...
    }
}
