package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class Sonnet29 implements Poem {

    private static String[] LINES = {"aa","bb"};

    public Sonnet29(){

    }



    @Override
    public void recite() {
        for(String string : LINES){
            System.out.println(string);
        }
    }
}
