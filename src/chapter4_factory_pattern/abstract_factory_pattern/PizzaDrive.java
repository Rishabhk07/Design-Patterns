package chapter4_factory_pattern.abstract_factory_pattern;

import chapter4_factory_pattern.NyPizzaStore;
import chapter4_factory_pattern.abstract_factory_pattern.ingredients.Pizza;

public class PizzaDrive {
    public static void main(String[] args) {
        PizzaIngredientFactory nyIngredientFactory = new NyStyleIngredientFactory();
        Pizza pizza = new CheesePizza(nyIngredientFactory);
        pizza.prepare();
    }
}
