package Assignment8.ConcreteVisitors;

import Assignment8.Visitor.IVisitor;
import Assignment8.Element.IDevice;
import Assignment8.ConcreteElements.Thermostat;
import Assignment8.ConcreteElements.Lighting;
import Assignment8.ConcreteElements.SecurityCamera;

public class DiagnosticVisitor implements IVisitor {
    public String diagnose(IDevice... devices){
        String result = "";
        for (IDevice device : devices) {
            result += device.getClass().getSimpleName() + ": " + device.accept(this) + "\n";
        }

        return result;
    }

    public String visitThermostat(Thermostat thermostat) {
        return thermostat.getStatus();
    }

    public String visitLighting(Lighting lighting) {
        return lighting.getStatus();
    }

    public String visitSecurityCamera(SecurityCamera securityCamera) {
        return securityCamera.getStatus();
    }
}
