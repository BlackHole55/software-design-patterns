package Assignment8.ConcreteElements;

import Assignment8.Element.IDevice;
import Assignment8.Visitor.IVisitor;

public class Thermostat implements IDevice{
    private String status;
    private double temperature;

    public Thermostat(String status, double temperature) {
        this.status = status;
        this.temperature = temperature;
    }

    public Thermostat() {}

    public String accept(IVisitor visitor) {
        return visitor.visitThermostat(this);
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
