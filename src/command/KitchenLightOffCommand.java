package command;

public class KitchenLightOffCommand extends LightOffCommand {
    KitchenLight light;

    public KitchenLightOffCommand(KitchenLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
