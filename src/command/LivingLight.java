package command;

public class LivingLight {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("Living room light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Living room light is "+isOn);
    }

}
