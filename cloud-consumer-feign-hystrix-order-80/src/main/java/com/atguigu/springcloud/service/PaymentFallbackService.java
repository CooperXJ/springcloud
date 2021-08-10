package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 薛进
 * @version 1.0
 * @Description
 * @date 2021/8/9 11:03 下午
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOk(Integer id) {
        return "impl paymentInfoOk";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "impl paymentInfoTimeOut";
    }
}
