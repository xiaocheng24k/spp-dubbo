package cn.com.xiaocheng.api.impl;

import cn.com.xiaocheng.api.TestApi;
//import cn.com.xiaocheng.util.RedisUtil;
import cn.com.xiaocheng.pojo.User;
import cn.com.xiaocheng.dao.TestDao;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestApi")
public class TestApiImpl implements TestApi {

    private static final Logger logger = LoggerFactory.getLogger(TestApiImpl.class);

//    @Autowired
//    RedisUtil redisUtil;
    @Autowired
    TestDao testDao;

    public String testservice() {
        logger.info("改方法被调用");
//        boolean set = redisUtil.set("aaa", "bbb");
//        System.out.println(set);
        List<User> users = testDao.selectUser();
        logger.info("查询数据库为 : {}",JSON.toJSONString(users));
        return "hello";
    }
}
