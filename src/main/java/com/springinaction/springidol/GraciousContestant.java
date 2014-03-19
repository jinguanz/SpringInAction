package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/16/14.
 */
public class GraciousContestant implements Contestant {
    @Override
    public void receiveAward(){
        System.out.println("Reveive Oskar award.");
    }
    @Override
    public void rejectAward(){
        System.out.println("Reject Oskar award.");
    }
}
