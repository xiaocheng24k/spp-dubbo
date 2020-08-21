package cn.com.xiaocheng.api.test;


import cn.com.xiaocheng.SppApplicationTest;
import cn.com.xiaocheng.api.TestApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SppApplicationTest.class)
public class TestApiImplTest {


    @Autowired
    TestApi testApi;

    @Test
    public void testServiceTest(){
        System.out.println(testApi.testservice());
    }
}
