package decorator;

/**
 * 饮料抽象类 对应component
 * @author mind1969
 * @version 1.0
 */
public abstract class Beverage {

    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
