package com.zuozhen.map;

/**
 * * //二，Map接口：双列数据，保存具有映射关系“key-value对”的集合   《数学意义上的函数》
 * /---HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 * 1.HashMap：Map的主要实现类，线程不安全，效率高，存储null的key和value
 * 1.1 LinkedHashMap：HashMap的子类，在原有基础上添加了两个引用，可以实现按照添加的顺序进行遍历
 * 对于频繁的遍历操作，效率高于HashMap
 * 2.TreeMap：可以按照添加的键值对进行排序，实现排序遍历（按照key）
 * 底层：红黑树
 * 3.Hashtable：古老的实现类，线程安全，效率低，不能存储null的key和value
 * 3.1 Properties：常用来处理配置文件，key和value均为String类型
 * <p>
 * HashMap底层：
 * 数组加链表（jdk7）
 * 数组加链表加红黑树（jdk8）
 */
public class MapTest {
    /*
    HashMap底层实现原理
    //jdk7
    HashMap map = new HashMap();//实例化后，创建了一个长度为16的一维数组Entry[] table
    ...多次put...
    map.put(key1,value);
    //1.首先计算key1的哈希值（所在类要重写equals和hashCode）
    //2.经过某算法后得到在table里的存放位置
        //如果此位置为空，添加成功
        //如果此位置上的数据不为空（一个或者多个（链表）），即比较哈希值
            //如果key1哈希值与所有数据key哈希值均不相同，添加成功
            //如果与某一个数据key哈希值相同，继续调用key1的equals方法
                //如果true，使用value1替换相同key的value值
                //如果false，添加成功

     扩容问题：默认：扩容为原来容量的2倍，并复制原来数据
    //jdk8 相较于 jdk7的不同
    1.在实例化时，底层没有创建一个长度为16的数组
    2.jdk8底层的数组为Node[]，而不是Entry[]
    3.首次put时，底层才会创建长度为16的数组
    4.jdk7：数组+链表    jdk8：数组+链表+红黑树
    当数组某一个索引上的元素以链表形式存在的数据个数>8且当前数组长度>64时，
    此时索引位置上的所有数据改为使用红黑树存储
     */
}
