package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public String getPayment(String id) {
        return "PaymentFallbackService---------"+"id";
    }
}
