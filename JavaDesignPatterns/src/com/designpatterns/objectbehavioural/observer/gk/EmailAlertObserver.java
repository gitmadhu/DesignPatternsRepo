package com.designpatterns.objectbehavioural.observer.gk;

public class EmailAlertObserver implements Observer {

	@Override
	public void update(String operation) {
		// TODO Auto-generated method stub
		System.out.println("EmailAlertObserver says: "+operation+" Operation performed on the account ");
	}

}
