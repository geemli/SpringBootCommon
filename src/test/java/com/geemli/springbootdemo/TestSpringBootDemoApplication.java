package com.geemli.springbootdemo;

import org.springframework.boot.SpringApplication;

public class TestSpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
