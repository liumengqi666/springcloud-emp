package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpProviderApplication.class, args);
    }
}
