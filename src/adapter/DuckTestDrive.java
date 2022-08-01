package adapter;

/**
 * 测试适配器
 * @author midn1969
 * @version 1.0
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("the Duck says...");
        testDuck(duck);

        System.out.println("the turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
