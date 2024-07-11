import Observable.IphoneObservableImplementation;
import Observable.StocksObservable;
import Observer.EmailNotificationObserver;
import Observer.MobileNotificationObserver;
import Observer.NotificationObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StocksObservable notificationObservable = new IphoneObservableImplementation();

        NotificationObserver obs1 = new EmailNotificationObserver("saurabh@gmail.com", new IphoneObservableImplementation());
        NotificationObserver obs2 = new MobileNotificationObserver("7507635505", new IphoneObservableImplementation());
        NotificationObserver obs3 = new EmailNotificationObserver("saurabhkarekar@gmail.com", new IphoneObservableImplementation());

        notificationObservable.add(obs1);
        notificationObservable.add(obs2);
        notificationObservable.add(obs3);

        notificationObservable.setStock(10);
    }
}