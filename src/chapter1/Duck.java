package chapter1;

import chapter1.Fly.FlyBehavior;
import chapter1.Quak.QuakBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    public Duck(){

    }

    public abstract void Display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuak(){
        quakBehavior.quak();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuakBehavior(QuakBehavior quakBehavior){
        this.quakBehavior = quakBehavior;
    }

    public void swim() {
        System.out.println("All Ducks can float, even the rubber");
    }
}
