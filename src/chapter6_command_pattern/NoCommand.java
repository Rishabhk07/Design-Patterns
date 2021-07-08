package chapter6_command_pattern;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No Command Found for this Slot");
    }

    @Override
    public void undo() {
    }
}
