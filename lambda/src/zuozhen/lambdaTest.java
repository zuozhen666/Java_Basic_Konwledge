package zuozhen;

import org.junit.Test;

import java.util.Arrays;

public class lambdaTest {
    /*
    lambda表达式：
    可传递的代码块。匿名函数，可以实现接口中的方法，对接口进行简洁实现，简化代码。
    并不是所有接口都可以用lambda实现，只能实现函数式接口。
     */
    /*
    函数式接口：一个接口中，要求实现类必须实现的抽象方法，有且只有一个。
     */
    @Test
    public void test() {
        /*
        写lambda表达式需关注：参数列表/方法体
        基础语法：
        (参数) -> {
            方法体
        };
         */
    }

    @FunctionalInterface//该注解可以判断是否为函数式接口，如果不是会报错
    interface FunctionalInterfaceTest{
        void test();
        String toString();
    }
}

