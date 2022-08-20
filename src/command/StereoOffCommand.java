package command;

/**
 * 关闭音响
 * @author mind1969
 * @version 1.0
 * @date 2022/08/20 13:33
 */
public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
