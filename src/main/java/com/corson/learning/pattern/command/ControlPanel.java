package com.corson.learning.pattern.command;

/**
 * ControlPanel
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class ControlPanel {
    private static final int CONTROL_SIZE = 4;
    private Command[] commands;

    public ControlPanel() {
        commands = new Command[CONTROL_SIZE];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = new NoCommand();

        }
    }

    /**
     * 设置命令
     *
     * @param index
     * @param command
     */
    public void setCommands(int index, Command command) {
        this.commands[index] = command;
    }


    /**
     * 点击
     *
     * @param index
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }

}
