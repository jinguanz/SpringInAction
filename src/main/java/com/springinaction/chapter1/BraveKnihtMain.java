package com.springinaction.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jinguangzhou on 3/2/14.
 */
public class BraveKnihtMain {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();

    }
}
