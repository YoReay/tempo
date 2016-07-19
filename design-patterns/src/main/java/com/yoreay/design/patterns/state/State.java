package com.yoreay.design.patterns.state;

/**
 * Created by sanze on 2016/7/19.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
