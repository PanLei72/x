package com.panlei.x.manufacture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ManufactureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManufactureApplication.class, args);
    }

}
