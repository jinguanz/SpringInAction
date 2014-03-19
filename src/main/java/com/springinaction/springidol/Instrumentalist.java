package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jinguangzhou on 3/4/14.
 */
public class Instrumentalist implements Performer {

    public Instrumentalist(){

    }

    private String song;

    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }
    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override

    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();

    }
}
