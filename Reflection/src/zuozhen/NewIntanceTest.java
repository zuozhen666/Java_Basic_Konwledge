package zuozhen;

import org.junit.Test;

public class NewIntanceTest {
    /*
    通过反射创建运行时类的对象
     */
    @Test
    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        Class c = Person.class;
        Class c = Class.forName("zuozhen.Person");
        Object newInstance = c.newInstance();//调用了空参构造器（权限不为private）
//        Class<Person> c2 = Person.class;
//        Person person = c2.newInstance();
        System.out.println(newInstance);//Person{name='null', age=0}
//        System.out.println(person);//Person{name='null', age=0}
    /*
    反射：动态性（运行时代码可以根据某些条件改变自身结构）
     */
    }
}
