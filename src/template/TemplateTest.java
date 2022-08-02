package template;

/**
 * 模板模式测试
 * 模板方法模式：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤
 * @author mind1969
 * @version 1.0
 */
public class TemplateTest {

    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
