package com.dongxz.tolecen.sample.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dongxz on 15/12/3.
 */
public class ConsumerBootstrap {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("tolecen-consumer.xml");
    }

}
