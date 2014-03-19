package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler() {
    }

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting....");
        poem.recite();

    }

    public void initMethod() {
        System.out.println("Init method.");
    }

    public void destroyMethod() {
        System.out.println("Destroy method.");
    }
}
