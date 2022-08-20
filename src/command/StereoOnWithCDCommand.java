package command;

/**
 * 开启音响
 * @author mind1969
 * @version 1.0
 * @date 2022/08/20 13:33
 */
public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
