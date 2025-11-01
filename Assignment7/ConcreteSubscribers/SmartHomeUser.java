package Assignment7.ConcreteSubscribers;

import java.util.HashMap;

import Assignment7.Subscriber.ISubscriber;

public class SmartHomeUser implements ISubscriber {
    private final String NAME; 
    private HashMap<String, String> state = new HashMap<>();
    private final String KEY_MISSING_MESSAGE = "No such key, please try another one";


    public SmartHomeUser(String name) {
        this.NAME = name;
    }

    @Override
    public void update(HashMap<String, String> state) {
        this.state = state;
    }

    public String getState(String key) {
        return this.state.getOrDefault(key, KEY_MISSING_MESSAGE);
    }

    public String getName() {
        return this.NAME;
    }
}
