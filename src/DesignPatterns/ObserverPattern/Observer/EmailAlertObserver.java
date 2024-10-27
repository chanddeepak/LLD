package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserver(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!");
    }

    public void sendEmail(String emailId, String msg) {
        System.out.println("Mail sent to: " + emailId);
    }
}
