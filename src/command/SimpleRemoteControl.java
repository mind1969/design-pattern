package command;

/**
 * 远程控制对象-遥控器
 * @author mind1969
 * @version 1.0
 * @date 2022/08/03 23:42
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    };

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
