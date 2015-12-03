package com.dongxz.tolecen.sample.provider;


import com.dongxz.tolecen.core.server.RpcService;
import com.dongxz.tolecen.sample.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    private static final Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(String name) {

        log.info("Tolecen consumer: provider's request ==>> {}", name);

        return "Hello! " + name;
    }

}
