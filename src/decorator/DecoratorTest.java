package decorator;

/**
 * 装饰者模式测试
 * @author mind1969
 * @version 1.0
 * @date 2022/08/03 00:22
 */
public class DecoratorTest {


    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
    }

}
