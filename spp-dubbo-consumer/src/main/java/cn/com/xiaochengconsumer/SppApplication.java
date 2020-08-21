package cn.com.xiaochengconsumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "cn.com.xiaochengconsumer.*",exclude = DataSourceAutoConfiguration.class)
@ImportResource(locations = "classpath:double-consumer.xml")
public class SppApplication {
    public static void  main(String arg[]){
        SpringApplication.run(SppApplication.class,arg);
    }
}
