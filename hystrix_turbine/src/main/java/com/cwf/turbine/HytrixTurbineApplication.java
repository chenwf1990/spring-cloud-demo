package com.cwf.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author chenwf
 * @date 2020/5/24
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class HytrixTurbineApplication {
    /**
     * 通过http://localhost:8031/hystrix访问监控平台
     * 服务需要暴露所有actuator监控的断路器
     * management:
     *   endpoints:
     *     web:
     *       exposure:
     *         include: '*'  #暴露所有actuator监控的断路器
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HytrixTurbineApplication.class,args);
    }
}
