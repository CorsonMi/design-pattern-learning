package com.corson.learning.pattern.command;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Door
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class Door {

    public void on() {
        System.out.println("开门");
    }

    public void off() {
        System.out.println("关门");
    }
}
