package Assignment7.ConcretePublisher;

import Assignment7.Publisher.BasePublisher;
import Assignment7.Utils.StateKeys;

public class SmartHeater extends BasePublisher {
    private final String UNUSUAL_TEMPERATURE_MESSAGE = "Warning: Unusually high or low temperature setting.";

    public void setTemperature(double temperature) {
        if (temperature < 0 || temperature > 40) {
            System.out.println(UNUSUAL_TEMPERATURE_MESSAGE);
        }
        setState(StateKeys.TEMPERATURE, String.valueOf(temperature));
    }
}