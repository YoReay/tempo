package com.yoreay.design.patterns.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by sanze on 2016/7/20.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
