package com.ivandu.smvc.test;

import com.ivandu.smvc.controller.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        HelloWorld helloWorld = context.getBean("helloBean", HelloWorld.class);
        helloWorld.sayHello();
    }
}
