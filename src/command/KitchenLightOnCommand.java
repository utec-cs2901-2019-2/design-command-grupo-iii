package command;

public class KitchenLightOnCommand implements Command {
    KitchenLight light;

    public KitchenLightOnCommand(KitchenLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
