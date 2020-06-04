package com.corson.learning.pattern.strategy.channel;

import com.corson.learning.pattern.common.CodeEnum;
import com.corson.learning.pattern.common.Result;

import java.math.BigDecimal;

/**
 * Alipayment
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-04
 */
public class Alipayment implements IPayment {
    @Override
    public PayEnum type() {
        return PayEnum.ALI_PAY;
    }

    @Override
    public Result pay(BigDecimal amount) {
        System.out.printf("【支付宝】：成功支付%s元%n", amount);
        return new Result(CodeEnum.SUCCESS.getCode());
    }
}
