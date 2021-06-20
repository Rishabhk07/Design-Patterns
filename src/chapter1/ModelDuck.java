package chapter1;

import chapter1.Fly.FlyNoWings;
import chapter1.Quak.MuteQuak;
import chapter1.Quak.Squeak;

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
