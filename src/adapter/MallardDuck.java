package adapter;

/**
 * 绿头鸭
 * @Author mind1969
 * @version 1.0
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am Fly");
    }
}
