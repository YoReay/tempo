package com.yoreay.design.patterns.command;

/**
 * Created by sanze on 2016/7/15.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
