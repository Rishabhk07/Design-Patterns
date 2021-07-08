package chapter6_command_pattern;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light is ON");
    }

    public void off(){
        System.out.println(name + " Light is OFF");
    }
}
