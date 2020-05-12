package com.corson.learning.pattern.command;

/**
 * CommandTest
 * <p>
 * 假设现在有电视、电灯等家电，现在需要你做个遥控器控制所有家电的开关，
 * 要求做到每个按钮对应的功能供用户个性化，对于新买入家电要有非常强的扩展性。
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
