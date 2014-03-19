package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/16/14.
 */
public class Magician implements MindReader {

    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
        System.out.println("Thinker't thoughts is " + thoughts);
    }

    public String getThoughts() {
        return thoughts;
    }

}
