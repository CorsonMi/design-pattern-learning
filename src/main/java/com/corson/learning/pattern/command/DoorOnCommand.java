package com.corson.learning.pattern.command;

/**
 * DoorOnCommand
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class DoorOnCommand implements Command {
    private Door door;

    public DoorOnCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.on();
    }
}
