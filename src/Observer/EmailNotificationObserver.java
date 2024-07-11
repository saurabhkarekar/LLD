package Observer;

import Observable.StocksObservable;

public class EmailNotificationObserver implements NotificationObserver{
    StocksObservable observable;
    String email;

    public EmailNotificationObserver(String email, StocksObservable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("mail send to " + email);
    }
}
