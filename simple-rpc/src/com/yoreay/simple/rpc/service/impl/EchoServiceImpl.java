package com.yoreay.simple.rpc.service.impl;

import com.yoreay.simple.rpc.service.EchoService;

/**
 * Created by sanze on 2016/7/7.
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String ping) {
        return ping != null ? ping + " --> I am ok." : "I am ok.";
    }
}
