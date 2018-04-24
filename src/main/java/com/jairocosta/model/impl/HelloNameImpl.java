package com.jairocosta.model.impl;

import com.jairocosta.model.HelloName;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloNameImpl implements HelloName {
    @Override
    public void getName() {
        String hostname;
        try
        {
            hostname = InetAddress.getLocalHost().getHostName();

        }
        catch (UnknownHostException ex)
        {
            hostname = "Hostname can not be resolved";
        }
        System.out.println(hostname);
    }
}
