package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 启动类
 * @author: chunguang.yao
 * @date: 2019-11-21 23:36
 */
@Configuration // 配置类
@EnableAutoConfiguration // 开启自动配置
@ComponentScan // 包扫描
public class SpringBootMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMavenApplication.class, args);
    }
}
