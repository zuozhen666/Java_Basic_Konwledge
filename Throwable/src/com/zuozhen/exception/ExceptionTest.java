package com.zuozhen.exception;

/*
 *
 * 异常体系结构
 * java.lang.Throwable
 * -------->java.lang.Error
 * -------->java.lang.Exception
 * ---------------->编译时异常
 * ---------------->运行时异常
 *
 */
public class ExceptionTest {
    /*
    异常举例
     */
    /*
    异常处理方式：
    1.try-catch-finally
    2.throws+异常类型
     */
    /*
    异常处理：抓抛模型
    “抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象；
            并将对象抛出；
            一旦抛出对象后，其后的代码就不再执行。

    “抓”：异常处理方式（两种方式）
        1.try-catch-finally
        try{//可能出现异常的代码
        }catch(异常类型1 变量名1){
        //处理异常的方式1
        }catch(){（catch中的异常类型没有子父类关系，则声明顺序无所谓
        如果有子父类关系，要求子类声明在父类上面，否则报错）
        }...//多个catch
        finally{//一定会执行的代码（可选）
        }
        //常用异常对象的处理方式：1.String getMessage() 2.printStackTrace()
        //try结构中声名的变量，出了try结构后就不能被调用
        //1.try-catch-finally处理编译时异常，编译时不报错，但是运行时可能会报错，相当于延迟了异常的出现
        //2.开发中通常不对于运行时异常编写try-catch-finally

        2.throws + 异常类型
        //写在方法的声明处
        //抛给方法的调用者
        //还是要用try-catch-finally解决

     */

    /*
    方法重写的异常规则：抛出的异常不大于父类被重写方法抛出的异常类型
     */
    /*
    两种方法的选择问题：
        1.如果父类中被冲重写的方法没有用throws的方法处理异常，那么子类重写的方法中有异常就只能使用try-catch-finally；
        2.执行的方法，先后调用了另外几个方法，建议被执行方法采用throws，本方法采用try-catch-finally，懂自懂。
     */
    /*

    手动生成一个异常对象并抛出(throw)

     */
    /*
    自定义异常类
    1.继承于现有的异常结构，RunTimeException...
    2.提供全局常量：serivalVersionUID（序列号）
    3.提供重载的构造器
     */
    public static void main(String[] args) {
    }
}
