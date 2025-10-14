package Assignment5;

public class Main {
    public static void main(String[] args) {
        RobotVacuum robotVacuum = new RobotVacuum();
        VoiceControlDecorator voiceControlRobotVacuum = new VoiceControlDecorator(robotVacuum);

        System.out.println(voiceControlRobotVacuum.enable());

        
        DeviceFacade deviceFacade = new DeviceFacade();
        IDevice voiceControlRobotVacuum2 = deviceFacade.createVoiceControlRobotVacuum();

        System.out.print(voiceControlRobotVacuum2.enable());
    }
}
