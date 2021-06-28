package chapter4_factory_pattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Daniel ordered " + pizza.getName());

    }
}
