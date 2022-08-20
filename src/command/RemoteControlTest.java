package command;

/**
 * 命令模式测试类
 * @author mind1969
 * @version 2.0
 * @date 2022/08/08 23:08
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");

        GarageDoor garageDoor = new GarageDoor();

        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remote.setCommand(2, garageDoorOpenCommand, garageDoorOffCommand);
        remote.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);

        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
    }
}
