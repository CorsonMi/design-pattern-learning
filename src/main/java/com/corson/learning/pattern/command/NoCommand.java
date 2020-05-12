package com.corson.learning.pattern.command;

/**
 * NoCommand
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("do nothing");
    }
}
