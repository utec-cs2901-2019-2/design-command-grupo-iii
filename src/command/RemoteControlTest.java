package command;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		remote.setCommand(lightOn);
		remote.buttonPressed();

		CeilingFan ceilingFan = new CeilingFan();
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);

		remote.setCommand(ceilingFanHigh);
		remote.buttonPressed();

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOnCommand garageDoorOn = new GarageDoorOnCommand(garageDoor);
		GarageDoorOffCommand garageDoorOff = new GarageDoorOffCommand(garageDoor);

		remote.setCommand(garageDoorOn);
		remote.buttonPressed();

		KitchenLight kitchenLight = new KitchenLight();
		KitchenLightOnCommand kitchenLightOn = new KitchenLightOnCommand(kitchenLight);
		KitchenLightOffCommand kitchenLightOff = new KitchenLightOffCommand(kitchenLight);

		remote.setCommand(kitchenLightOn);
		remote.buttonPressed();

		Stereo stereo = new Stereo();
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remote.setCommand(stereoOn);
		remote.buttonPressed();

		LivingLight livingLight = new LivingLight();
		LivingLightOnCommand livingLightOn = new LivingLightOnCommand(livingLight);
		LivingLightOffCommand livingLightOff = new LivingLightOffCommand(livingLight);

		remote.setCommand(livingLightOn);
		remote.buttonPressed();
	}
}
