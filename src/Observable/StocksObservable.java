package Observable;

import Observer.NotificationObserver;

public interface StocksObservable {

    public void add(NotificationObserver observer);

    public void delete(NotificationObserver observer);

    public void notifySubscribers();

    public void setStock(int newStockAdded);

}
