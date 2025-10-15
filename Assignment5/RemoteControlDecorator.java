package Assignment5;

public class RemoteControlDecorator extends DeviceDecorator{
    public RemoteControlDecorator(IDevice device) {
        super(device);
    }

    @Override
    public String enable() {
        return super.enable() + " (Enabled via remote)";
    }

    @Override
    public String disable() {
        return super.disable() + " (Disabled via remote)";
    }
}
