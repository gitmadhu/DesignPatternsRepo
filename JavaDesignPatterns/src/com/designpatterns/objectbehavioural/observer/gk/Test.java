package com.designpatterns.objectbehavioural.observer.gk;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account subject = new Account();
		
		Observer observer1 = new TransactionObserver();
		Observer observer2 = new MobileAlertObserver();
		Observer observer3 = new EmailAlertObserver();
		
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.registerObserver(observer3);
		
		subject.editRecord("Deposit");
	}

}
