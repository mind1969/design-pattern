package command;

/**
 * 关灯命令
 * @authr mind1969
 * @version 1.0
 * @date 2022/08/10 23:30
 */
public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

}
