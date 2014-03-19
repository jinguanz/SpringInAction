package com.springinaction.springidol;

import org.aspectj.lang.annotation.*;

/**
 * Created by jinguangzhou on 3/17/14.
 */

@Aspect
public class Audience2 {

    @Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
    public void performance(){

    }

    @Before("performance()")
    public void takeSeats(){
       System.out.println("Take seats.");
    }

    @Before("performance()")
    public void turnOffPhone(){
        System.out.println("Turn off your cell phone.");
    }

    @AfterReturning("performance()")
    public void applaud(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("BOO! We want our money back.");
    }
}
