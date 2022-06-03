package com.yummy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yummy.mapper")
public class YummyApplication {

    public static void main(String[] args) {
        SpringApplication.run(YummyApplication.class, args);
    }

}
