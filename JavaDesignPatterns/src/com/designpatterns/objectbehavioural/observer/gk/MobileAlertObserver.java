package com.designpatterns.objectbehavioural.observer.gk;

public class MobileAlertObserver implements Observer {

	@Override
	public void update(String operation) {
		// TODO Auto-generated method stub
		System.out.println("MobileAlertObserver says: "+operation+" Operation performed on the account ");
	}

}
