package cn.com.xiaocheng.api.impl;

import cn.com.xiaocheng.api.TestApi;
//import cn.com.xiaocheng.util.RedisUtil;
import cn.com.xiaocheng.pojo.User;
import cn.com.xiaocheng.dao.TestDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestApi")
public class TestApiImpl implements TestApi {

//    @Autowired
//    RedisUtil redisUtil;
    @Autowired
    TestDao testDao;

    public String testservice() {
        System.out.println("改方法被调用");
//        boolean set = redisUtil.set("aaa", "bbb");
//        System.out.println(set);
        List<User> users = testDao.selectUser();
        System.out.println(JSON.toJSONString(users));
        return "hello";
    }
}
