package command;

/**
 * 打开吊扇 最高档
 * @author mind1969
 * @version 1.0
 * @date 2022/08/20 16:39
 */
public class CeilingFanHighCommand implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
