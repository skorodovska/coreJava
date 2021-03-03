package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        //启动springboot应用
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
