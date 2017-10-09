package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/10/9.
 */
@SpringBootApplication(scanBasePackages = "com.boot")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
