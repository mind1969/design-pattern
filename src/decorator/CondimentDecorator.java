package decorator;

/**
 * 调料抽象类
 * @author mind1969
 * @version 1.0
 */
public abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();//所有调料类都必须重新实现getDescription方法

}
