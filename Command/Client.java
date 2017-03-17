public class Client {
    public static void main(String[] args) {
        Light kitchenLight = new Light();
        Stereo stereo = new Stereo();
        Command lightOn = new LightOnCommand(kitchenLight);
        Command lightOff = new LightOffCommand(kitchenLight);
        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        RemoteControl controller = new RemoteControl();

        controller.setCommand(0, lightOn, lightOff);
        controller.setCommand(1, stereoOn, stereoOff);

        controller.pushOnButton(0);
        controller.pushUndo();
        controller.pushOnButton(0);
        controller.pushOffButton(0);
        controller.pushUndo();
        controller.pushOnButton(1);
        controller.pushOnButton(0);
        controller.pushOffButton(1);
        controller.pushUndo();
        controller.pushUndo();
        controller.pushUndo();
        controller.pushUndo();
        controller.pushUndo();
    }
}

