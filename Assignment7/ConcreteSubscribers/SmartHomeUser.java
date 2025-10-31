package Assignment7.ConcreteSubscribers;

import java.util.HashMap;

import Assignment7.Subscriber.ISubscriber;

public class SmartHomeUser implements ISubscriber {
    private final String NAME; 
    private HashMap<String, String> heaterAttributes = new HashMap<>();
    private final String KEY_MISSING_MESSAGE = "No such key, please try another one";


    public SmartHomeUser(String name) {
        this.NAME = name;
    }

    @Override
    public void updateHeater(HashMap<String, String> heaterAttributes) {
        this.heaterAttributes = heaterAttributes;
    }

    public String getHeaterAttribute(String key) {
        return this.heaterAttributes.getOrDefault(key, KEY_MISSING_MESSAGE);
    }

    public String getName() {
        return this.NAME;
    }
}
