package tech.yeez.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import tech.yeez.boot.utils.SpringBeanUtil;

/**
 * 数据库自动生成工具：tech.yeez.boot.utils.Generator
 *
 * @description: Application
 * @author: xiangbin
 * @create: 2022-04-07 16:47
 **/
@SpringBootApplication
@MapperScan("tech.yeez.boot.mapper")
@EnableFeignClients(basePackages = {"tech.yeez.boot.service.feign"})
public class HelloWorldApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(HelloWorldApplication.class, args);

        SpringBeanUtil.applicationContext = configurableApplicationContext;
    }
}
