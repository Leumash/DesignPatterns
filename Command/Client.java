public class Client {
    public static void main(String[] args) {
        Light kitchenLight = new Light();
        Command lightOn = new LightOnCommand(kitchenLight);
        Command lightOff = new LightOffCommand(kitchenLight);

        RemoteControl controller = new RemoteControl();

        controller.setCommand(0, lightOn, lightOff);

        controller.pushOnButton(0);
        controller.pushUndo();
        controller.pushOnButton(0);
        controller.pushOffButton(0);
        controller.pushUndo();
    }
}

