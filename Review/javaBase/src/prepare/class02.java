package prepare;

import org.junit.Test;

public class class02 {
    /*
    String：声明为final，不可被继承。(Integer等包装类也不可被继承)
    java 8:内部使用char[]存储数据；
    java 9:byte[]存储字符串，使用byte coder来标识使用哪种编码；
     */
    /*
    不可变的好处：
        1.缓存hash值
        2.String Pool的需要
        3.安全性
        4.线程安全
     */
    /*
    String/StringBuffer/StringBuilder
    1.String不可变，其余可变
    2.String不可变，天生线程安全；
      StringBuilder 不是线程安全
      StringBuffer 线程安全，内部使用synchronized同步
     */
    /*
    String Pool
    保存literal strings，在编译时期确定。
    还可使用String的intern()方法在运行过程中将字符串添加到String Pool

    java7之前，String Pool被放在运行时常量池，属于永久代。
    java7之后，String Pool被移到堆中。
    reason:永久代空间有限，在大量使用字符串的场景下会导致OutOfMemoryError
     */
    /*
    new String("abc")
    会创建两个字符串对象（前提Spring Pool中还没有"abc"字符串对象）
    1.编译时期会在String Pool中创建一个字符串对象，指向"abc"字符串字面量
    2.new方式会在堆中创造一个字符串对象。
     */
    @Test
    public void test() {
        //String s = new String("abc");
/*
    源码：new会在堆中创建一个字符串对象，
    然后将String Pool中的字符串对象作为String构造器函数的参数
        public String(String original) {
            this.value = original.value;
            this.hash = original.hash;
        }
        */
/*
jdk7对intern操作和常量池的修改(?)
1.String常量池从Perm到JavaHeap
2.调用intern时，如果存在堆中的对象，会直接保存对象的引用，而不会重新创建对象

     * When the intern method is invoked, if the pool already contains a
     * string equal to this {@code String} object as determined by
     * the {@link #equals(Object)} method, then the string from the pool is
     * returned. Otherwise, this {@code String} object is added to the
     * pool and a reference to this {@code String} object is returned.
 */
    }
}
