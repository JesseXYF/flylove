package com.jesse.flylove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.jesse.flylove.mapper")
public class FlyloveApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyloveApplication.class, args);
    }

}
