package template;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * 咖啡V2----带有钩子函数
 * @author mind1969
 * @version 1.0
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase(Locale.ROOT).startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Woudle you like milk and sugar with your cofffee (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
