package com.jairocosta.config;

import com.jairocosta.model.HelloName;
import com.jairocosta.model.HelloTime;
import com.jairocosta.model.impl.HelloBeanImpl;
import com.jairocosta.model.HelloBean;
import com.jairocosta.model.impl.HelloNameImpl;
import com.jairocosta.model.impl.HelloTimeImpl;
import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name="HelloBean")
    public HelloBean bean(){
        return new HelloBeanImpl();
    }

    @Bean(name="HelloTime")
    public HelloTime helloTime(){
        return new HelloTimeImpl();
    }
    @Bean(name="HelloName")
    public HelloName helloName(){
        return new HelloNameImpl();
    }
}
