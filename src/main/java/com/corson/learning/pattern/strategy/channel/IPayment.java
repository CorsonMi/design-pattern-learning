package com.corson.learning.pattern.strategy.channel;

import com.corson.learning.pattern.common.Result;

import java.math.BigDecimal;

/**
 * Payment
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-02
 */
public interface IPayment {

    PayEnum type();

    Result pay(BigDecimal amount);
}
