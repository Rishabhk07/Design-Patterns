package chapter4_factory_pattern.abstract_factory_pattern.ingredients;

public class Pizza {
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public String name;

    public void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough..." + dough.name);
        System.out.println("Adding sauce..." + sauce.name);
        System.out.println("Adding cheese: " + cheese.name);
    }

    public void bake(){
        System.out.println("Baking");
    }

    public void box(){
        System.out.println("Boxing !!");
    }


}
