package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String userId;
    StocksObservable stocksObservable;

    public MobileAlertObserver(String userId, StocksObservable stocksObservable) {
        this.userId = userId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userId, "Products is in stocks. Hurry up!");
    }

    public void sendMsgOnMobile(String userId, String msg) {
        System.out.println("Message sent to : " + userId);
    }
}
