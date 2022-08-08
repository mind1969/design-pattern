package command;

/**
 * 打开点灯的命令
 * @author mind1969
 * @version 1.0
 * @date 2022/08/03 23:36
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
