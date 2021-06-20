package chapter1.Fly;

public class FlyNoWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I don't fly since I have no wings");
    }
}
