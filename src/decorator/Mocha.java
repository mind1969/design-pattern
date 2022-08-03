package decorator;

/**
 * 摩卡调料
 * @author mind1969
 * @version 1.0
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha" ;
    }
}
