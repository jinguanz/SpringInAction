package com.springinaction.springidol;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class Stage {
    private Stage() {

    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
