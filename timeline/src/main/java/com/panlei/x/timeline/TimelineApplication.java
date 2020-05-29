package com.panlei.x.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TimelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimelineApplication.class, args);
    }

}
