package Assignment8.ConcreteVisitors;

import Assignment8.Visitor.IVisitor;
import Assignment8.Element.IDevice;
import Assignment8.ConcreteElements.Thermostat;
import Assignment8.ConcreteElements.Lighting;
import Assignment8.ConcreteElements.SecurityCamera;

public class EnergyUsageVisitor implements IVisitor{
    public String energyUsage(IDevice... devices) {
        String result = "";
        for (IDevice device : devices) {
            result += device.getClass().getSimpleName() + ": " + device.accept(this) + "\n";
        }

        return result;
    }

    public String visitThermostat(Thermostat thermostat) {
        double energyUsageMultiplier = 1.5;
        double usage = energyUsageMultiplier * thermostat.getTemperature();
        return usage + " kWh";
    }

    public String visitLighting(Lighting lighting) {
        double energyUsageMultiplier = 0.5;
        double usage = energyUsageMultiplier * lighting.getBrightness();
        return usage + " kWh";
    }

    public String visitSecurityCamera(SecurityCamera securityCamera) {
        double energyUsageMultiplier = 0.01;
        double usage = energyUsageMultiplier * securityCamera.getRecordingTimeSec();
        return usage + " kWh";
    }
}