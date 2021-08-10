package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 薛进
 * @version 1.0
 * @Description
 * @date 2021/8/8 7:54 下午
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    Payment getPaymentById(Long id);
}
