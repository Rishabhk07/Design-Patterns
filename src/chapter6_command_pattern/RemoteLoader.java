package chapter6_command_pattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(7);
        Light livingRoomLight = new Light("living Room");
        Light kitchenLight = new Light("Kitchen");

        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorUp);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOnWithCDCommand);

        System.out.println(remoteControl);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();


    }

}
