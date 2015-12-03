package com.dongxz.tolecen.sample.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderBootstrap {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("tolecen-provider.xml");
    }
}
