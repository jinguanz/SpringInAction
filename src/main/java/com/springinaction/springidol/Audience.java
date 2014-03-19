package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by jinguangzhou on 3/16/14.
 */
public class Audience {
    public void takeSeats() {
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("BOO! We want money back!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("Take seats");
            System.out.println("Turn off cellphones");
            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();

            System.out.println("CLAP CLAP");
            System.out.println("The whole performance took " + (end -start) + " milliseconds.");

        }catch (Throwable t){
            System.out.println("Boo! We want our money back");
        }

    }
}
