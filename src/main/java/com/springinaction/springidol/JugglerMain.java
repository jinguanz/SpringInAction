package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class JugglerMain {

    public static void main(String args[]) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol-aop-demo.xml");

        //Performer performer = (Performer)context.getBean("duke");
        //performer.peform();

        /*  autowire byConstructor
        Performer performer = (Performer)context.getBean("duke");
        performer.perform();
        */


        //Performer performer = (Performer) context.getBean("duke");
        Performer performer1 = (Performer)context.getBean("juggler");
        performer1.perform();
       //Contestant contestant = (Contestant)context.getBean("juggler");
       //contestant.receiveAward();
        //performer.perform();
    }
}
