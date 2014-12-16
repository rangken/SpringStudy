package com.rangken.test.main;

import com.rangken.test.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@ComponentScan({ "com.rangken.test", "com.rangken.test.controller" })
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.scan("com.rangken.test");
        ctx.refresh();

        SpringApplication.run(Main.class, args);
        System.out.println("Start");
    }
    @RequestMapping("/")
    public String home() {
        return "Hello World2";
    }
    @RequestMapping("/2")
    public String home2() {
        return "Hello World3";
    }
}
