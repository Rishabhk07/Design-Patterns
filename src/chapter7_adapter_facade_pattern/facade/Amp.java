package chapter7_adapter_facade_pattern.facade;

public class Amp {

    public void on(){
        System.out.println("Amp is ON");
    }

    public void surroundSound(){
        System.out.println("Set Surround sound on Amp");
    }

    public void setVolume(int volume){
        System.out.println("setting the volume to " + volume);
    }

    public void off(){
        System.out.println("Amp is off");
    }
}
