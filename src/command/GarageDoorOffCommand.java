package command;

/**
 * 关闭车库门
 * @author mind1969
 * @version 1.0
 * @version 2022/08/20 13:28
 */
public class GarageDoorOffCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
