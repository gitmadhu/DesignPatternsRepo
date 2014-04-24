package com.designpatterns.objectbehavioural.observer.gk;

public class TransactionObserver implements Observer {

	@Override
	public void update(String operation) {
		// TODO Auto-generated method stub
		System.out.println("TransactionObserver says: "+operation+" Operation performed on the record ");
	}

}
