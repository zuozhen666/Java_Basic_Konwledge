package zuozhen;

import org.junit.Test;
import zuozhen.FunctionalInterfaces.SingleReturnSingleParameter;

/*
进阶语法
 */
public class BasicPro {
    @Test
    public void test() {
        /*
        相关结构的省略
         */
        //1.实现一个参数，有返回值的函数式接口
        //参数类型可省略
        SingleReturnSingleParameter lambda1 = (a) -> {
            return a;
        };
        //如果参数有且只有一个，小括号可省略
        SingleReturnSingleParameter lambda2 = a -> {
            return 2 * a;
        };
        //如果方法体只有一句话，可省略{}，如果该句话为return，那么return也省略
        SingleReturnSingleParameter lambda3 = a -> 3 * a;
    }

    /*
    函数引用：如果实现逻辑太复杂，就写一个方法，然后用lambda表达式来引用
     */
    private interface Calculate {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
//        Calculate calculate = (x, y) -> calculate(x, y);//引用的函数参数与返回值要与接口里的匹配
        //类::静态方法
        Calculate calculate = BasicPro::calculate;
        System.out.println(calculate.calculate(3, 3));
        //对象::非静态方法
        BasicPro basicPro = new BasicPro();
        Calculate calculate1 = basicPro::calculate2;
        System.out.println(calculate1.calculate(4, 4));
    }

    private int calculate2(int x, int y) {
        if (x > y) {
            return x - y;
        } else if (x < y) {
            return y - x;
        } else {
            return x + y;
        }
    }

    private static int calculate(int x, int y) {
        if (x > y) {
            return x - y;
        } else if (x < y) {
            return y - x;
        } else {
            return x + y;
        }
    }

    private interface GetPerson {
        Person get();
    }

    private interface GetPersonWithSingleParameter {
        Person get(String name);
    }

    private interface GetPersonWithMultipleParameter {
        Person get(String name, int age);
    }

    @Test
    public void test1() {
        /*
        构造器的引用
         */
        GetPerson getPerson = Person::new;
        GetPersonWithSingleParameter getPersonWithSingleParameter = Person::new;
        GetPersonWithMultipleParameter getPersonWithMultipleParameter = Person::new;
    }
}
