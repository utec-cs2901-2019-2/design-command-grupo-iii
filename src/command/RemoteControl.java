package command;

public class RemoteControl {
	Command slot;

	public RemoteControl() {}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonPressed() {
		slot.execute();
	}
}
