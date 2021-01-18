package com.zuozhen.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * 1.注解声明为@inference
 * 2.内部定义成员，通常用value表示
 * 3.可以指定成员默认值，用default定义
 * 4.如果自定义注解没有成员，表明是一个标识作用
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
    //String[] values();
    //String value();
    String value() default "hello";
}
