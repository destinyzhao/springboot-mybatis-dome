package com.winter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.winter.mapper")
public class SpringbootMybatisDomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDomeApplication.class, args);
    }
}
