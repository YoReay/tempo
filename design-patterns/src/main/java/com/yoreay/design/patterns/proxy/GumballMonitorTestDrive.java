package com.yoreay.design.patterns.proxy;

import java.rmi.Naming;

/**
 * Created by sanze on 2016/7/20.
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://127.0.0.1/gumballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < location.length; i++) {
            monitors[i].report();
        }
    }

}
