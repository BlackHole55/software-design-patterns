package Assignment5;

public class DeviceDecorator implements IDevice {
    IDevice device;

    public DeviceDecorator(IDevice device) {
        this.device = device;
    }

    @Override
    public String enable() {
        return this.device.enable();
    }

    @Override
    public String disable() {
        return this.device.disable();
    }
}
