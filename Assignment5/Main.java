package Assignment5;

import Assignment5.Decorator.RemoteControlDecorator;
import Assignment5.Decorator.VoiceControlDecorator;
import Assignment5.Facade.DeviceFacade;

public class Main {
    public static void main(String[] args) {
        RobotVacuum robotVacuum = new RobotVacuum();
        VoiceControlDecorator voiceControlRobotVacuum = new VoiceControlDecorator(robotVacuum);

        System.out.println(voiceControlRobotVacuum.enable());

        SmartCamera smartCamera = new SmartCamera();
        RemoteControlDecorator remoteControlCamera = new RemoteControlDecorator(smartCamera);

        System.out.println(remoteControlCamera.enable());

        DeviceFacade deviceFacade = new DeviceFacade();

        deviceFacade.leaveHome();
        deviceFacade.comeHome();
    }
}
