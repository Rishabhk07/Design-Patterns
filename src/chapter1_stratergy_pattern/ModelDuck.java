package chapter1_stratergy_pattern;

import chapter1_stratergy_pattern.Fly.FlyNoWings;
import chapter1_stratergy_pattern.Quak.Squeak;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWings();
        quakBehavior = new Squeak();
    }

    @Override
    public void Display() {
        System.out.println("I am Model Duck !!! ");
    }
}
