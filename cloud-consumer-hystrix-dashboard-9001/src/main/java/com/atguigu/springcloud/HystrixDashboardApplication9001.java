package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard  //访问 http://localhost:9001/hystrix
public class HystrixDashboardApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication9001.class,args);
    }
}