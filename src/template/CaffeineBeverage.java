package template;

/**
 * 咖啡因饮料类
 * @author mind1969
 * @version 1.0
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();

        brew();

        pourInCup();

        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
