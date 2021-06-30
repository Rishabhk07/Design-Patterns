package chapter4_factory_pattern.abstract_factory_pattern;

import chapter4_factory_pattern.PizzaStore;
import chapter4_factory_pattern.abstract_factory_pattern.ingredients.Dough;
import chapter4_factory_pattern.abstract_factory_pattern.ingredients.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        ingredientFactory = pizzaIngredientFactory;
        name = "Cheese Pizza";
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}
