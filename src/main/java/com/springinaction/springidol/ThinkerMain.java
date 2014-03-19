package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jinguangzhou on 3/16/14.
 */
public class ThinkerMain {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol-aop-demo.xml");
        Thinker thinker = (Thinker)context.getBean("volunteer");
        thinker.thinkOfSomething("I am super man");


    }
}
