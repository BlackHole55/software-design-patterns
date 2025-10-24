package Assignment6.ConcreteStrategies;

import Assignment6.Strategy.LightingMode;

public class ReadingMode implements LightingMode{
    private String message = "Setting warm light for reading";

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
