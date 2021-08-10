package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  //http://localhost:3344/config-dev.yaml
public class ConfigServerApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3344.class,args);
    }
}
