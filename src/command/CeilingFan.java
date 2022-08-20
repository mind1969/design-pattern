package command;

/**
 * 吊扇对象类
 * @version 1.0
 * @author mind1969
 * @date 2022/08/20 16:33
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " " + "on the ceilingfan speed is high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " " + "on the ceilingfan speed is medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " " + "on the ceilingfan speed is low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " " + "off the ceilingfan");
    }

    public int getSpeed() {
        return this.speed;
    }

}
