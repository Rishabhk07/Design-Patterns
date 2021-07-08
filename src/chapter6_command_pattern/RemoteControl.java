package chapter6_command_pattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(int slotSize) {
        onCommands = new Command[slotSize];
        offCommands = new Command[slotSize];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slotSize; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------Remote Control-------------\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("\n Undo Command : "+ undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }

}
