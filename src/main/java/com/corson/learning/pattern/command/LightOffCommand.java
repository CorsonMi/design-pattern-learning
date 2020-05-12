package com.corson.learning.pattern.command;

/**
 * LightOffCommand
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
