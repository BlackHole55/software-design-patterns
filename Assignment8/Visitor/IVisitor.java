package Assignment8.Visitor;

import Assignment8.ConcreteElements.Lighting;
import Assignment8.ConcreteElements.SecurityCamera;
import Assignment8.ConcreteElements.Thermostat;

public interface IVisitor {
    public String visitThermostat(Thermostat thermostat);
    public String visitLighting(Lighting lighting);
    public String visitSecurityCamera(SecurityCamera securityCamera);
}