package chapter7_adapter_facade_pattern.facade;

public class DVD {

    public void on() {
        System.out.println("DVD on");
    }

    public void play(String movie) {
        System.out.println("PLaying movie" + movie);
    }

    public void off() {
        System.out.println("DVD off");
    }
}
