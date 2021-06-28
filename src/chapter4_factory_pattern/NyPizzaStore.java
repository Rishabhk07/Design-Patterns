package chapter4_factory_pattern;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStylePizza();
        } else if (type.equals("veggie")) {
            return new NYStylePizza();
        } else if (type.equals("clam")) {
            return new NYStylePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePizza();
        } else return null;
    }
}
