package com.corson.learning.pattern.strategy;

import com.corson.learning.pattern.common.Result;
import com.corson.learning.pattern.strategy.channel.IPayment;
import com.corson.learning.pattern.strategy.channel.PayEnum;

import java.math.BigDecimal;

/**
 * StategyTest
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-04
 */
public class StategyTest {
    public static void main(String[] args) {
        IPayment payment = new PayStategy().build(null);
        payment.pay(new BigDecimal(1000.00));
    }
}
