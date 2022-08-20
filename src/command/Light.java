package command;

/**
 * 点灯类
 * @author mind1969
 * @version 2.0
 * @date 2022/08/03 23:47
 */
public class Light {

    String description;

    public Light(String description){
        this.description = description;
    }

    public void on(){
        System.out.println(description + "on the light");
    }

    public void off(){
        System.out.println(description + "off the light");
    }
}
