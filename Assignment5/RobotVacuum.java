package Assignment5;

public class RobotVacuum implements IDevice {
    @Override
    public String enable() {
        return "Start cleaning"; 
    }

    @Override
    public String disable() {
        return "Finish cleaning";
    }
}