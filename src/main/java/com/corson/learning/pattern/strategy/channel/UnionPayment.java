package com.corson.learning.pattern.strategy.channel;

import com.corson.learning.pattern.common.CodeEnum;
import com.corson.learning.pattern.common.Result;

import java.math.BigDecimal;

/**
 * UnionPayment
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-04
 */
public class UnionPayment implements IPayment {
    @Override
    public PayEnum type() {
        return PayEnum.UNION_PAY;
    }

    @Override
    public Result pay(BigDecimal amount) {
        System.out.println(System.out.printf("【联合】：成功支付%s元%n", amount));
        return new Result(CodeEnum.SUCCESS.getCode());
    }
}
