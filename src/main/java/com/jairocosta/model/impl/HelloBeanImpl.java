package com.jairocosta.model.impl;

import com.jairocosta.model.HelloBean;


public class HelloBeanImpl implements HelloBean {
    @Override
    public void printHelloBean(String msg) {
        System.out.println("Hello " + msg);
    }
}
