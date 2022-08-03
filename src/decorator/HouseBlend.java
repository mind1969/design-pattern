package decorator;

/**
 * HouseBlend咖啡
 * @author mind1969
 * @version 1.0
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
