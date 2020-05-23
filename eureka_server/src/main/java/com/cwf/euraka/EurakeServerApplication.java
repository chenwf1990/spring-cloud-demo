package com.cwf.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenwf
 * @date 2020/5/21
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurakeServerApplication.class,args);
    }
}
