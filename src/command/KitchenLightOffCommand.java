package command;

public class KitchenLightOffCommand implements Command {
    KitchenLight light;

    public KitchenLightOffCommand(KitchenLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
