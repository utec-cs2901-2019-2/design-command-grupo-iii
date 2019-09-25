package command;

public class LivingLightOnCommand implements Command {
    LivingLight l_light;

    public LivingLightOnCommand(LivingLight light) {
        this.l_light = l_light;
    }

    @Override
    public void execute() {
        l_light.on();
    }
}
