package chapter4_factory_pattern.abstract_factory_pattern;

import chapter4_factory_pattern.abstract_factory_pattern.ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClaims();
}
