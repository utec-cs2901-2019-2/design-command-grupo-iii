package command;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public LightOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
