package cn.com.xiaochengconsumer.api.test;


import cn.com.xiaochengconsumer.SppApplicationTest;
import cn.com.xiaochengconsumer.api.TestConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SppApplicationTest.class)
public class TestApiImplTest {


    @Autowired
    TestConsumer testConsumer ;

    @Test
    public void testConsumerTest(){
        testConsumer.testConsumerTest();
    }
}
