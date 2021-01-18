package com.zuozhen.annotation;

/*
 * 注解
 * //使用示例：
 * 1.生成文档相关的注解
 * 2.在编译时进行格式检查（jdk内置的三个基本注解）
 * @Override：重写（只用于方法）
 * @Deprecated：用于表示所修饰的元素（类，方法等）已过时，通常是结构危险或者是有更好的选择
 * @SuppressWarnings：抑制编译器警告
 * 3.跟踪代码依赖性，实现替代配置文件功能
 * //自定义注解：
 * 参照@SuppressWarnings
 * 自定义注解通常都会指明两个元注解1，2
 *
 * jdk提供4种元注解
 * 元注解：用于修饰其他注解定义
 * 1.Retention：指定注解的生命周期
 * SOURCE：编译器丢弃
 * CLASS：（默认行为）保留在class文件里，但是不会被加载到内存中
 * RUNTIME：保留在class文件里并且运行时会加载到内存中，反射能够获取
 * 2.Target：用于指定被修饰的注解能用于修饰哪些程序元素
 * 3.Documented：指定被修饰的注解类将被javadoc工具提取成文档，javadoc默认不包含注解
 * 4.Inherited：被修饰的注解具有继承性
 *
 * //jdk8注解新特性：可重复注解，类型注解
 *
 * 类型注解：
 * ElementType.TYPE_PARAMETER   表示该注解能写在类型变量的声名语句中（如：泛型声名）
 * ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句中
 *
 * */
public class AnnotationTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int num = 10;
    }
}

@MyAnnotation("hi")
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
