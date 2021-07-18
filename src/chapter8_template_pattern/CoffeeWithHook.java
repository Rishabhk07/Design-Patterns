package chapter8_template_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add milk and sugar");
    }

    @Override
    boolean customerWantsCondiments() {
        String input = getUserInput();
        if (input.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    String getUserInput() {
        String answer = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
