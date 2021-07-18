package chapter8_template_pattern;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater(){
        System.out.println("Water Boiling !! ");
    }

    void pourInCup(){
        System.out.println("Pouring in Cup !! ");
    }

    boolean customerWantsCondiments(){
        return true;
    }

    abstract void brew();
    abstract  void addCondiments();


}
