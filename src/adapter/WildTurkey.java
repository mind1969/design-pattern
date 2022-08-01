package adapter;

/**
 * 野火鸡
 * @author mind1969
 * @version 1.0
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I an flying a short distance");
    }
}
