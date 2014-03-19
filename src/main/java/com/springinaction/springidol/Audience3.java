package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by jinguangzhou on 3/17/14.
 */
@Aspect
public class Audience3 {

    @Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
    public void performance(){

    }

    @Around("performance()")
    public void wathcPerformance(ProceedingJoinPoint joinPoint){
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
