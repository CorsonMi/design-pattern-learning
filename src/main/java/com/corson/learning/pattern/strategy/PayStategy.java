package com.corson.learning.pattern.strategy;

import com.corson.learning.pattern.strategy.channel.IPayment;
import com.corson.learning.pattern.strategy.channel.PayEnum;
import sun.misc.Service;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * PayStategy
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-02
 */
public class PayStategy {
    private static ConcurrentHashMap<String, IPayment> iPaymentConcurrentHashMap = new ConcurrentHashMap<String, IPayment>(3);

    static {
        ServiceLoader<IPayment> loader = ServiceLoader.load(IPayment.class);
        Iterator<IPayment> iterator = loader.iterator();
        while (iterator.hasNext()) {
            IPayment iPayment = iterator.next();
            iPaymentConcurrentHashMap.put(iPayment.type().getCode(), iPayment);
        }
    }

    public IPayment build(PayEnum payEnum) {
        if (null == payEnum) {
            payEnum = PayEnum.WECHAT_PAY;
        }
        return iPaymentConcurrentHashMap.get(payEnum.getCode());
    }
}
