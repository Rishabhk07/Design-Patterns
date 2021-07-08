package chapter6_command_pattern;

public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand command = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);


        remote.setCommand(command);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
