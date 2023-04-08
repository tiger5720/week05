package Observer;

import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject{
    private int price;

    public void setPrice(int price) {
        this.price = price;
        notifySubscriber();
    }

    private List<Subscriber> subscribers;

    public LandCh() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public int getPrice() {
        return price;
    }

    @Override
    public void notifySubscriber() {
       /* for (Subscriber subscriber : subscribers)
            subscriber.update(price);*/

       // subscribers.forEach(s -> s.update(price));  //람다표현식
        subscribers.forEach(Subscriber::update);
    }
}
