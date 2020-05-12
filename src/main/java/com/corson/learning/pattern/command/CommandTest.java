package com.corson.learning.pattern.command;

/**
 * CommandTest
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class CommandTest {
    private static final ControlPanel CONTROL_PANEL = new ControlPanel();

    /**
     * 初始化命令
     */
    static {
        Door door = new Door();
        Light light = new Light();
        /**
         * 添加到控制器
         */
        CONTROL_PANEL.setCommands(0, new LightOnCommand(light));
        CONTROL_PANEL.setCommands(1, new LightOffCommand(light));
        CONTROL_PANEL.setCommands(2, new DoorOnCommand(door));
        CONTROL_PANEL.setCommands(3, new DoorOffCommand(door));
    }

    public static void main(String[] args) {
        //开门，开灯
        CONTROL_PANEL.keyPressed(2);
        CONTROL_PANEL.keyPressed(0);
    }
}
