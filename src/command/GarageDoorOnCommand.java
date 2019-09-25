package command;

public class GarageDoorOnCommand implements Command {
    GarageDoor garage;

    public GarageDoorOnCommand(GarageDoor garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();
    }
}
