package Assignment5;

public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(IDevice device) {
            super(device);
    }

    @Override
    public String enable() {
        return super.enable() + " (enabled through voice command)";
    }

    @Override
    public String disable() {
        return super.disable() + " (disabled through voice command)";
    }
}