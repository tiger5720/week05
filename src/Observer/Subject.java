package Observer;

import java.util.concurrent.Flow;

public interface Subject {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();

    int getPrice();
}
