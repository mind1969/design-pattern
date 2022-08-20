package command;

/**
 * 关闭吊扇
 * @author mind1969
 * @verison 1.0
 * @date 2022/08/20 16:47
 */
public class CeilingFanOffCommand implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
