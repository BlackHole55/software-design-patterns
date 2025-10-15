package Assignment5;

public class SmartCamera implements IDevice {
    @Override
    public String enable() {
        return "Turn on camera";
    }

    @Override
    public String disable() {
        return "Turn off camera";
    }
}
