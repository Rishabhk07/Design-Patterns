package chapter6_command_pattern;

public class Stereo{

    public void on(){
        System.out.println("Stereo is ON");
    }

    public void setCD(){
        System.out.println("Setting a CD on Stereo");
    }

    public void setVolume(int volume){
        System.out.println("Setting volume to " + volume);
    }

    public void off(){
        System.out.println("Stereo is OFF!");
    }
}
