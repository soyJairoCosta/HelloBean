package com.jairocosta.model.impl;

import com.jairocosta.model.HelloTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloTimeImpl implements HelloTime {
    @Override
    public void getTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
