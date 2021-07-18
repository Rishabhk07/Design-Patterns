package chapter7_adapter_facade_pattern.facade;

public class Popcorn {
    public void on() {
        System.out.println("Popcorn machine on");
    }

    public void pop() {
        System.out.println("Popping some corn, coming up popcorn in a min");
    }

    public void off() {
        System.out.println("Popcorn machine is off");
    }

}
