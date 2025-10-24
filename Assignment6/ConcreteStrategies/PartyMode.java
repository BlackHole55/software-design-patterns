package Assignment6.ConcreteStrategies;

import Assignment6.Strategy.LightingMode;

public class PartyMode implements LightingMode{
    private String message = "Setting colorful lights for a party";

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void adjust_light() {
        System.out.println(message);
    }
}
