package com.dongxz.tolecen.sample.consumer;


import com.dongxz.tolecen.core.consumer.RpcProxy;
import com.dongxz.tolecen.sample.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloAction {

    private static final Logger log = LoggerFactory.getLogger(HelloAction.class);

    private RpcProxy rpcProxy;

    public void setRpcProxy(RpcProxy rpcProxy) {
        this.rpcProxy = rpcProxy;
    }

    public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                HelloService helloService = rpcProxy.create(HelloService.class);
                String hello = helloService.hello("World");

                log.info("Tolecen consumer: provider's response ==>> {}", hello);

            } catch (Exception e) {
                e.printStackTrace();
            }

            Thread.sleep(2000);
        }
    }
}
