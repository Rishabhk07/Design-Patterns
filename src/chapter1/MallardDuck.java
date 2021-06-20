package chapter1;

import chapter1.Fly.FlyWithWings;
import chapter1.Quak.Quak;

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
