package com.ytc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.ytc.mapper")
public class TeachProviderOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachProviderOrderApplication.class, args);
    }

}
