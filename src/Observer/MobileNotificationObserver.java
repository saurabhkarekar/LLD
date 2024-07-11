package Observer;

import Observable.StocksObservable;

public class MobileNotificationObserver implements NotificationObserver{
    StocksObservable observable;
    String mobileNumber;

    public MobileNotificationObserver(String mobileNumber, StocksObservable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("msg sent to " + mobileNumber);
    }
}
