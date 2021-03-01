package prepare;

import org.junit.Test;

public class class01 {
    /*
    基本数据类型：
    byte/8
    char/16
    short/16
    int/32
    float/32
    long/64
    double/64
    boolean/~{
        JVM会在编译时期将boolean类型的数据转换为int,1->true,0->false;
        JVM支持boolean数组，但是是通过读写byte[]来实现的。
    }
     */
    /*
    new Integer(123)每次新建一个对象
    Integer.valueOf(123)使用缓存池中的对象，多次调用会取得同一对象的引用
    java 8中：Integer缓存池大小默认为-128~127
     */
    @Test
    public void test() {
//        Integer n = 123;//自动装箱=Integer.valueOf(123)
//        Integer m = 123;
//        System.out.println(n == m);//true
        Integer n = 128;
        Integer m = 128;
        System.out.println(n == m);//false
    }
    /*
    基本类型对应缓冲池：
    boolean:true/false
    byte:all
    short:-128~127
    int:-128~127
    char:\u0000~\u007F
     */
    //jdk1.8所有数值类缓冲池中，Integer很特殊，上界是可调的{
    // 在启动 jvm 的时候，
    // 通过 -XX:AutoBoxCacheMax=<size> 来指定这个缓冲池的大小，
    // 该选项在 JVM 初始化的时候会设定一个名为 java.lang.IntegerCache.high 系统属性，
    // 然后 IntegerCache 初始化的时候就会读取该系统属性来决定上界
    // }
}
