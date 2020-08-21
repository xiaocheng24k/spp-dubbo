package cn.com.xiaocheng;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "cn.com.xiaocheng.*")
@MapperScan(basePackages ="cn.com.xiaocheng.dao")
@ImportResource(locations = "classpath:double-provider.xml")
public class SppApplication {
    public static void  main(String arg[]){
        SpringApplication.run(SppApplication.class,arg);
    }
}
