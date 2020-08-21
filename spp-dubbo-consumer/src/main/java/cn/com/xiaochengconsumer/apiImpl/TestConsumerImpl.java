package cn.com.xiaochengconsumer.apiImpl;

import cn.com.xiaochengconsumer.api.TestConsumer;
import cn.com.xiaocheng.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TestConsumer")
public class TestConsumerImpl implements TestConsumer {

    @Autowired
    TestApi testApi;

    public void testConsumerTest() {
        System.out.println("开始dubbo接口调用");
        System.out.println("dubbo调用:"+testApi.testservice());
    }

}
