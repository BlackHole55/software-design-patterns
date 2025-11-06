package Assignment8;

import Assignment8.ConcreteElements.Lighting;
import Assignment8.ConcreteElements.SecurityCamera;
import Assignment8.ConcreteElements.Thermostat;
import Assignment8.ConcreteVisitors.DiagnosticVisitor;
import Assignment8.ConcreteVisitors.EnergyUsageVisitor;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostatCelsius1 = new Thermostat("On", 25);
        Lighting lighting1 = new Lighting("On");
        SecurityCamera secCam1 = new SecurityCamera("Recording");

        lighting1.setBrightness(150);
        System.out.println(lighting1.getBrightness());
        lighting1.setBrightness(50);

        secCam1.setRecordingTimeSec(7200);

        DiagnosticVisitor diagnosticVisitor = new DiagnosticVisitor();

        System.out.println(diagnosticVisitor.diagnose(thermostatCelsius1, lighting1, secCam1));

        EnergyUsageVisitor energyUsageVisitor = new EnergyUsageVisitor();

        System.out.println(energyUsageVisitor.energyUsage(thermostatCelsius1, lighting1, secCam1));
    }
}
