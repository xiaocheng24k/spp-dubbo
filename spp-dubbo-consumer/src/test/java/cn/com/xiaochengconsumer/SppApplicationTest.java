package cn.com.xiaochengconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "cn.com.xiaochengconsumer.*")
@ImportResource(locations = "classpath:double-consumer.xml")
public class SppApplicationTest {
    public static void  main(String arg[]){
        SpringApplication.run(SppApplicationTest.class,arg);
    }
}
