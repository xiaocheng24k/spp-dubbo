package cn.com.xiaocheng.api.impl;

import cn.com.xiaocheng.api.TestApi;
//import cn.com.xiaocheng.util.RedisUtil;
import cn.com.xiaocheng.pojo.User;
import cn.com.xiaocheng.dao.TestDao;
import cn.com.xiaocheng.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestApi")
public class TestApiImpl implements TestApi {

    private static final Logger logger = LoggerFactory.getLogger(TestApiImpl.class);

    @Autowired
    RedisUtil redisUtil;
    @Autowired
    TestDao testDao;

    public String testservice() {
        logger.info("改方法被调用");
        boolean set = redisUtil.set("aaa", "bbb");
        logger.info("redis调用结果: {}",set);
        List<User> users = testDao.selectUser();
        logger.info("查询数据库为 : {}",JSON.toJSONString(users));
        return "hello";
    }

    public void redisGetTest(String key) {
        List<User> users = (List<User>)redisUtil.get(key);
        logger.info(JSON.toJSONString(users));
    }

    public void redisSetTest(String key) {
        List<User> users = testDao.selectUser();
        logger.info("查询数据库为 : {}",JSON.toJSONString(users));
        boolean set = redisUtil.set(key, users);
        logger.info("存入结果为：{}",set);
    }
}
