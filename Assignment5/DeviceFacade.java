package Assignment5;

public class DeviceFacade {
    private RobotVacuum robotVacuum = new RobotVacuum();
    private SmartCamera smartCamera = new SmartCamera();

    public void comeHome() {
        System.out.println(robotVacuum.disable());
        System.out.println(smartCamera.disable());
    }

    public void leaveHome() {
        System.out.println(robotVacuum.enable());
        System.out.println(smartCamera.enable());
    } 
}
