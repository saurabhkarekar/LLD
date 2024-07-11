package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplementation implements StocksObservable {
    List<NotificationObserver> notificationObservers = new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationObserver observer) {
        notificationObservers.add(observer);
    }

    @Override
    public void delete(NotificationObserver observer) {
        notificationObservers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver obs : notificationObservers){
            obs.update();
        }
    }

    @Override
    public void setStock(int newStockAdded) {
        if (stockCount ==0) {
            notifySubscribers();
        }

        stockCount = stockCount + newStockAdded;
    }

}
