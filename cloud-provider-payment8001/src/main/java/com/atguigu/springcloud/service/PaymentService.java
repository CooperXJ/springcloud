package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author 薛进
 * @version 1.0
 * @Description
 * @date 2021/8/8 8:01 下午
 */
public interface PaymentService {
    Payment getPaymentById(Long id);

    int create(Payment payment);
}
