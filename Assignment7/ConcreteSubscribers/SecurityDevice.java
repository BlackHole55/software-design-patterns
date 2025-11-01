package Assignment7.ConcreteSubscribers;

import java.util.HashMap;

import Assignment7.Subscriber.ISubscriber;

public class SecurityDevice implements ISubscriber {
    private final int ID; 
    private HashMap<String, String> state = new HashMap<>();
    private final String KEY_MISSING_MESSAGE = "No such key, please try another one";


    public SecurityDevice(int ID) {
        this.ID = ID;
    }

    @Override
    public void update(HashMap<String, String> state) {
        this.state = new HashMap<>(state);
    }

    public String getState(String key) {
        return this.state.getOrDefault(key, KEY_MISSING_MESSAGE);
    }

    public int getId() {
        return this.ID;
    }
}
