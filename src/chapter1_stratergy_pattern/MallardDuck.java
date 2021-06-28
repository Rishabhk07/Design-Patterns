package chapter1_stratergy_pattern;

import chapter1_stratergy_pattern.Fly.FlyWithWings;
import chapter1_stratergy_pattern.Quak.Quak;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quakBehavior = new Quak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void Display() {
        System.out.println("I am real Mallard");
    }

}
