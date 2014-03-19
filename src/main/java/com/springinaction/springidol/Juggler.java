package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {
    }


    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
