package com.corson.learning.pattern.template;

/**
 * Tea
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-07
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    /**
     * 钩子方法
     */
    @Override
    void hook() {
        System.out.println("提供自己的方法实现");
    }
}
