package com.yoreay.design.patterns.command;

/**
 * Created by sanze on 2016/7/15.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Do nothing.");
    }
}
