package Assignment7.Publisher;

import java.util.HashMap;
import java.util.HashSet;

import Assignment7.Subscriber.ISubscriber;

public abstract class BasePublisher implements IPublisher{
    private HashSet<ISubscriber> subscribers = new HashSet<>();
    private HashMap<String, String> state = new HashMap<>();
    private final String KEY_MISSING_MESSAGE = "No such key, please try another one";

    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(state);
        }
    }

    public String getState(String key) {
        return this.state.getOrDefault(key, KEY_MISSING_MESSAGE);
    }

    public void setState(String key, String value) {
        this.state.put(key, value);
        this.notifySubscribers();
    }
}
