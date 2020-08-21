package cn.com.xiaocheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.com.xiaocheng.*")
@MapperScan(basePackages ="cn.com.xiaocheng.dao")
public class SppApplicationTest {
    public static void  main(String arg[]){
        SpringApplication.run(SppApplicationTest.class,arg);
    }
}
