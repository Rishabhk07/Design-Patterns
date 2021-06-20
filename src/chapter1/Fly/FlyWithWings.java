package chapter1.Fly;

import chapter1.Fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with Wings !!!! ");
    }
}
