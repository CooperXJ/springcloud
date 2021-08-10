package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 薛进
 * @version 1.0
 * @Description
 * @date 2021/8/8 7:46 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private long id;
    private String serial;
}
