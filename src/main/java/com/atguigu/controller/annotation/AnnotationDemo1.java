package com.atguigu.controller.annotation;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: liyinghai
 * @Date: 2021/4/27 22:56
 */

@myInterface
public class AnnotationDemo1 {
    @myInterface
    public static void main(@myInterface String[] args) {

    }

    @myInterface
    private String str;

}


/**
 * @Target 说明了Annotation所修饰的对象范围
 *
 * 取值(ElementType)有：
 *
 * 1.CONSTRUCTOR:用于描述构造器
 *
 * 2.FIELD:用于描述成员变量
 *
 * 3.LOCAL_VARIABLE:用于描述局部变量
 *
 * 4.METHOD:用于描述方法
 *
 * 5.PACKAGE:用于描述包
 *
 * 6.PARAMETER:用于描述参数
 *
 * @Retention定义了该Annotation被保留的时间长短
 * 1.SOURCE:在源文件中有效（即源文件保留）
 * 2.CLASS:在class文件中有效（即class保留）
 * 3.RUNTIME:在运行时有效（即运行时保留）
 *
 * @Documented
 * @Documented用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。Documented是一个标记注解，没有成员。
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE_PARAMETER,ElementType.FIELD})
@interface myInterface{

}
