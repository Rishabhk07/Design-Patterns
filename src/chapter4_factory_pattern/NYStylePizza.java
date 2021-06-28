package chapter4_factory_pattern;

public class NYStylePizza extends Pizza{
    public NYStylePizza(){
        name = "NY Style Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("some cheese");
    }

    @Override
    void cut() {
        System.out.println("Only Single Cut in Ny Style Pizza");
    }
}
