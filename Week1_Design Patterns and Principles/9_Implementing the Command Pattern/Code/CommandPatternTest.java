public class CommandPatternTest {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("--- Testing Living Room Light ---");
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();

        remote.setCommand(livingRoomLightOff);
        remote.pressButton();

        System.out.println("\n--- Testing Kitchen Light ---");
        remote.setCommand(kitchenLightOn);
        remote.pressButton();

        remote.setCommand(kitchenLightOff);
        remote.pressButton();

        System.out.println("\n--- Demonstrating changing commands ---");
        System.out.println("Remote now controls Living Room Light ON:");
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();

        System.out.println("Remote now controls Kitchen Light OFF:");
        remote.setCommand(kitchenLightOff);
        remote.pressButton();
    }
}