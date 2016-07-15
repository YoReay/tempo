package com.yoreay.design.patterns.command;

/**
 * Created by sanze on 2016/7/15.
 */
public class Stereo {

    public void on() {
        System.out.println("Stereo is on.");
    }

    public void off() {
        System.out.println("Stereo is off.");
    }

    public void setCd() {
        System.out.println("A CD has in Stereo.");
    }

    public void setDvd() {
        System.out.println("A DVD has in Stereo.");
    }

    public void setRadio() {
        System.out.println("A radio has in Stereo.");
    }

    public void setVolume(int num) {
        System.out.println("current volume is " + num);
    }
}
