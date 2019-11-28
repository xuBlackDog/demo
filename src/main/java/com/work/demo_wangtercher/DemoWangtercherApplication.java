package com.work.demo_wangtercher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//这是扫描注解
@MapperScanner
@SpringBootApplication
public class DemoWangtercherApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWangtercherApplication.class, args);
    }

}
