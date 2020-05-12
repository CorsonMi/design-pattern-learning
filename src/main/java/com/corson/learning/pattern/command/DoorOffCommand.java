package com.corson.learning.pattern.command;

/**
 * DoorOffCommand
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-12
 */
public class DoorOffCommand implements Command {
    private Door door;

    public DoorOffCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.off();
    }
}
