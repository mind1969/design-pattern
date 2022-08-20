package command;

/**
 * 音响类
 * @author mind1969
 * @version 1.0
 * @date 2022/08/10 23:32
 */
public class Stereo {

    String description;

    public Stereo(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + "open the Stereo");
    }

    public void off() {
        System.out.println(description + "off the Stereo");
    }

    public void setCd() {
        System.out.println(description + "Stereo setCd");
    }

    public void setDvd() {
        System.out.println(description + "Stereo setDvd");
    }

    public void setRadio() {
        System.out.println(description + "Stereo setRadio");
    }

    public void setVolume(int volume) {
        System.out.println(description + "Stereo setVolumn " + volume);
    }
}
