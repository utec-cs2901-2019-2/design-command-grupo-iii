package command;

public class KitchenLightOnCommand extends LightOnCommand {
    KitchenLight light;

    public KitchenLightOnCommand(KitchenLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
