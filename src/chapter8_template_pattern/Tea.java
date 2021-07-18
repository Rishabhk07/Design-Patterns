package chapter8_template_pattern;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea bag");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
