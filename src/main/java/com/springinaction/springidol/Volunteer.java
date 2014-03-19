package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/16/14.
 */
public class Volunteer implements Thinker {
    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;

    }

    public String getThoughts(){
        return thoughts;
    }
}
