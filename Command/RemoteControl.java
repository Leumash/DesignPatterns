import java.util.*;

public class RemoteControl {
    private static final int TOTAL_BUTTONS = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> undo;

    public RemoteControl() {
        onCommands = new Command[TOTAL_BUTTONS];
        offCommands = new Command[TOTAL_BUTTONS];

        Command noCommand = new NoCommand();
        for (int i = 0; i<TOTAL_BUTTONS; ++i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undo = new Stack<Command>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        System.out.println("On pressed: " + slot);
        onCommands[slot].execute();
        undo.push(onCommands[slot]);
    }

    public void pushOffButton(int slot) {
        System.out.println("Off pressed: " + slot);
        offCommands[slot].execute();
        undo.push(offCommands[slot]);
    }

    public void pushUndo() {
        System.out.println("UNDO pressed");
        if (!undo.empty()) {
            undo.pop().undo();
        } else {
            System.out.println("Nothing to undo!");
        }
    }
}

