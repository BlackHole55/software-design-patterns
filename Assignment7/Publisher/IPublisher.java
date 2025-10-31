package Assignment7.Publisher;

import Assignment7.Subscriber.ISubscriber;

public interface IPublisher {
    public void subscribe(ISubscriber subscriber);
    public void unsubscribe(ISubscriber subscriber);
    public void notifySubscribers();
}