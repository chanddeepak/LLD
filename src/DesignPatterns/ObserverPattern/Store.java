package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverPattern.Observable.StocksObservable;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserver;
import DesignPatterns.ObserverPattern.Observer.MobileAlertObserver;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@email.com", iphoneObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("abc", iphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserver("abc@email.com", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }
}
