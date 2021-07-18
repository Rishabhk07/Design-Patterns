package chapter8_template_pattern;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Water is boiling !!");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring in cup !!");
    }

    abstract void addCondiments();

}
