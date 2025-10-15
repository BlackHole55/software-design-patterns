package Assignment5;

public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(IDevice device) {
            super(device);
    }

    @Override
    public String enable() {
        return super.enable() + " (Enabled through voice command)";
    }

    @Override
    public String disable() {
        return super.disable() + " (Disabled through voice command)";
    }
}