package cn.com.xiaocheng.api.test;


import cn.com.xiaocheng.SppApplicationTest;
import cn.com.xiaocheng.api.TestApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SppApplicationTest.class)
public class TestApiImplTest {

    private static final Logger logger = LoggerFactory.getLogger(TestApiImplTest.class);

    @Autowired
    TestApi testApi;

    @Test
    public void testServiceTest(){
        logger.info(testApi.testservice());
    }

    @Test
    public void redisGetTest(){
        testApi.redisGetTest("users");
    }

    @Test
    public void redisSetTest(){
        testApi.redisSetTest("users");
    }
}
