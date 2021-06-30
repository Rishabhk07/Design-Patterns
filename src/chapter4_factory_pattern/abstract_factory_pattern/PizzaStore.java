package chapter4_factory_pattern.abstract_factory_pattern;


import chapter4_factory_pattern.abstract_factory_pattern.ingredients.Pizza;

public class PizzaStore {
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory;

    public void orderPizza(){
        pizza.dough = ingredientFactory.createDough();
        pizza.cheese = ingredientFactory.createCheese();
        pizza.sauce = ingredientFactory.createSauce();

        pizza.prepare();
        pizza.bake();
        pizza.box();
    }
}
