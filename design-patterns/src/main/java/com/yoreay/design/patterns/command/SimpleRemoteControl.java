package com.yoreay.design.patterns.command;

/**
 * Created by sanze on 2016/7/15.
 */
public class SimpleRemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
