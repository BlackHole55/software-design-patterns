package Assignment7;

import Assignment7.ConcretePublisher.SmartHeater;
import Assignment7.ConcreteSubscribers.SmartHomeUser;

public class Main {
    public static void main(String[] args) {
        SmartHeater heaterCelsius1 = new SmartHeater(); 
        
        heaterCelsius1.setAttribute("temperature", "25C");
        heaterCelsius1.setAttribute("humidity", "50%");
        heaterCelsius1.setAttribute("heaterStatus", "On");

        SmartHomeUser marvinUser = new SmartHomeUser("Marvin");
        SmartHomeUser arthurUser = new SmartHomeUser("Arthur");
        SmartHomeUser douglasUser = new SmartHomeUser("Douglas");
    
        heaterCelsius1.subscribe(marvinUser);
        heaterCelsius1.subscribe(arthurUser);
        heaterCelsius1.subscribe(douglasUser);
        heaterCelsius1.notifySubscribers();

        System.out.println("temperature: " + marvinUser.getHeaterAttribute("temperature"));
        System.out.println("humidity: "+ arthurUser.getHeaterAttribute("humidity"));
        System.out.println("heater status: " + douglasUser.getHeaterAttribute("heaterStatus"));

        heaterCelsius1.setAttribute("heaterStatus", "Off");

        System.out.println("heater status: " + marvinUser.getHeaterAttribute("heaterStatus"));
    }
}
