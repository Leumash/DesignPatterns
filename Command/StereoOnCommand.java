public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.turnOn();
    }

    public void undo() {
        stereo.turnOff();
    }
}

