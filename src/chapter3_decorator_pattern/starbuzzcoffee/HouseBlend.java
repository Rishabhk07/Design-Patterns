package chapter3_decorator_pattern.starbuzzcoffee;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
