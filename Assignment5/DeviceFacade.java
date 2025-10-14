package Assignment5;

public class DeviceFacade {
    public IDevice createVoiceControlRobotVacuum() {
        RobotVacuum robotVacuum = new RobotVacuum();
        VoiceControlDecorator voiceControlRobotVacuum = new VoiceControlDecorator(robotVacuum);
        
        return voiceControlRobotVacuum;
    }
}
