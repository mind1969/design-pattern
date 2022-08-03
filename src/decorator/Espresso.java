package decorator;

/**
 * 浓缩咖啡
 * @author mind1969
 * @version 1.0
 */
public class Espresso extends Beverage{

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
