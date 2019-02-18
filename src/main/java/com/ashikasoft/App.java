package com.ashikasoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/test-maven-context.xml");
        System.out.println("Hello World!");
    }

    public App() {
        System.out.println("App ctor");
    }
}
