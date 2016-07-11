package com.yoreay.simple.rpc.service;

import com.yoreay.simple.rpc.service.exporter.RpcExporter;
import com.yoreay.simple.rpc.service.impl.EchoServiceImpl;
import com.yoreay.simple.rpc.service.importer.RpcImporter;

import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RpcExporter.exporter("localhost", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        RpcImporter<EchoService> importer = new RpcImporter<>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost", 8088));
        System.out.println(echo.echo("Are you ok ?"));
    }
}
