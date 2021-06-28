package chapter1_stratergy_pattern.Fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with Wings !!!! ");
    }
}
