package command;

public class CeilingFan {
    private boolean isHigh = false;
    public void  high(){
        isHigh = true;
        System.out.println("Ceiling fan set to high");
    }

    public void low(){
        isHigh = false;
        System.out.println("Ceiling fan set to low");
    }

}
