package com.yoreay.design.patterns.proxy;

import java.io.Serializable;

/**
 * Created by sanze on 2016/7/19.
 */
public interface State extends Serializable{

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
