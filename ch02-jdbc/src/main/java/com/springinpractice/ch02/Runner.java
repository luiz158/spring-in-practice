package com.springinpractice.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml", "context-test.xml");
    }
}
