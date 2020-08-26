package cn.com.xiaochengconsumer.apiImpl;

import cn.com.xiaochengconsumer.api.TestConsumer;
import cn.com.xiaocheng.api.TestApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TestConsumer")
public class TestConsumerImpl implements TestConsumer {
    private static final Logger logger = LoggerFactory.getLogger(TestConsumerImpl.class);

    @Autowired
    TestApi testApi;

    public void testConsumerTest() {
       logger.info("开始dubbo接口调用");
        logger.info("dubbo调用:"+testApi.testservice());
    }

}
