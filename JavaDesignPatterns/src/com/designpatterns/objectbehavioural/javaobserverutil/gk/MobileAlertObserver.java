package com.designpatterns.objectbehavioural.javaobserverutil.gk;
import java.util.Observable;
import java.util.Observer;


public class MobileAlertObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Account account = (Account)arg;
		System.out.println("MobileAlertObserver says: "+account.getOperation()+" Operation performed on the account");
	}

}
