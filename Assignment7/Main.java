package Assignment7;

import Assignment7.ConcretePublisher.SmartCamera;
import Assignment7.ConcretePublisher.SmartHeater;
import Assignment7.ConcreteSubscribers.SecurityDevice;
import Assignment7.ConcreteSubscribers.SmartHomeUser;
import Assignment7.Utils.StateKeys;

public class Main {
    public static void main(String[] args) {
        SmartHeater heaterCelsius1 = new SmartHeater(); 
        
        heaterCelsius1.setState(StateKeys.TEMPERATURE, "25C");
        heaterCelsius1.setState(StateKeys.HUMIDITY, "50%");
        heaterCelsius1.setState(StateKeys.HEATER_STATUS, "On");

        SmartHomeUser marvinUser = new SmartHomeUser("Marvin");
        SmartHomeUser arthurUser = new SmartHomeUser("Arthur");
        SmartHomeUser douglasUser = new SmartHomeUser("Douglas");
    
        heaterCelsius1.subscribe(marvinUser);
        heaterCelsius1.subscribe(arthurUser);
        heaterCelsius1.subscribe(douglasUser);
        heaterCelsius1.notifySubscribers();

        System.out.println(marvinUser.getName() + " { temperature: " + marvinUser.getState(StateKeys.TEMPERATURE) + " }");
        System.out.println(arthurUser.getName() + " { humidity: "+ arthurUser.getState(StateKeys.HUMIDITY) + " }");
        System.out.println(douglasUser.getName() + " { heater status: " + douglasUser.getState(StateKeys.HEATER_STATUS) + " }");

        heaterCelsius1.setState("heaterStatus", "Off");

        System.out.println(marvinUser.getName() + " { heater status: " + marvinUser.getState(StateKeys.HEATER_STATUS) + " }");

        SmartCamera camera1 = new SmartCamera();

        SecurityDevice secDevice1 = new SecurityDevice(1);

        camera1.subscribe(secDevice1);
        camera1.subscribe(arthurUser);
        camera1.subscribe(douglasUser);

        camera1.setState(StateKeys.CAMERA_STATUS, "On");
        camera1.setState(StateKeys.MOTION_DETECTED, "True");

        System.out.println(secDevice1.getId() + " { camera status: " + secDevice1.getState(StateKeys.CAMERA_STATUS) + " }");
        System.out.println(arthurUser.getName() + " { mothion detected: " + arthurUser.getState(StateKeys.MOTION_DETECTED) + " }");
    }
}
