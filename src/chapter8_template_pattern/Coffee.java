package chapter8_template_pattern;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("brew the coffee !!");
    }

    @Override
    void addCondiments() {
        System.out.println("add milk and sugar");
    }
}
