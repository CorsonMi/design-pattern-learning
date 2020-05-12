package com.corson.learning.pattern.template;


/**
 * Coffee
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-07
 */
public class Coffee extends CaffeineBeverageTemplate {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
