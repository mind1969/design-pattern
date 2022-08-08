package command;

/**
 * 命令模式测试类
 * @author mind1969
 * @version 1.0
 * @date 2022/08/08 23:08
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
