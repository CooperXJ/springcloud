package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController
{
    @Resource
    private PaymentService paymentService;
    @GetMapping(value = "/paymentSQL/{id}")
    public String paymentSQL(@PathVariable("id") String id)
    {
        return paymentService.getPayment(id);
    }
}