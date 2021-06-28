package chapter4_factory_pattern;

public class ChicagoStylePizza extends Pizza{
    public ChicagoStylePizza() {
        name = "Chicago Style Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Moserella");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}