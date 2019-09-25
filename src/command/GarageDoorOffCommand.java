package command;

public class GarageDoorOffCommand implements Command {
    GarageDoor garage;

    public GarageDoorOffCommand(GarageDoor garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();
    }
}
