package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class Saxophone implements Instrument {

    public Saxophone() {

    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT TOOT");
    }
}
