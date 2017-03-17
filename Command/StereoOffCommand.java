public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.turnOff();
    }

    public void undo() {
        stereo.turnOn();
    }
}

