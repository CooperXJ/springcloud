package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope  //实现动态刷新功能  这样还不够  还需要运维人员 主动发送post请求 http://lcoalhost:3355/actuator/refresh
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")  //访问 http://localhost:3355/configInfo
    public String getConfigInfo()
    {
        return configInfo;
    }
}