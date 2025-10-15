package Assignment5.Decorator;

import Assignment5.IDevice;

public class DeviceDecorator implements IDevice {
    private IDevice device;

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
