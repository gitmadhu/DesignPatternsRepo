package com.designpatterns.objectbehavioural.javaobserverutil.gk;
import java.util.Observable;
import java.util.Observer;


public class TransactionObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Account account = (Account)arg;
		System.out.println("TransactionObserver says: "+account.getOperation()+" Operation performed on the account");
	}

}
