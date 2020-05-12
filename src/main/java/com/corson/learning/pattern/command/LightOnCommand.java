package com.corson.learning.pattern.command;

/**
 * LightOnCommand
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
