package com.designpatterns.objectbehavioural.javaobserverutil.gk;

import java.util.Observer;



public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		Observer o = new EmailAlertObserver();
		a.addObserver(o);
		a.editRecord("withdraw", "1234");
		
	}

}
