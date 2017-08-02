package com.znkj.ticket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Web 应用启动入口程序
 * @author yangjian
 * @since 2017-07-25
 */
@SpringBootApplication
@MapperScan(basePackages = "com.znkj.ticket.mapper")
@EnableTransactionManagement
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
