package Assignment8.ConcreteElements;

import Assignment8.Element.IDevice;
import Assignment8.Visitor.IVisitor;

public class Lighting implements IDevice{
    private String status;
    private double brightness;
    private final String BRIGHTNESS_VALUE_ERROR = "Value of brightness shoud be between 0 and 100.";

    public Lighting(String status) {
        this.status = status;
    }

    public Lighting() {}

    public String accept(IVisitor visitor) {
        return visitor.visitLighting(this);
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBrightness() {
        return this.brightness;
    }

    public void setBrightness(double brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println(BRIGHTNESS_VALUE_ERROR);
        }
    }
}
