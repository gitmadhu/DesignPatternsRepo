package com.designpatterns.objectbehavioural.javaobserverutil.gk;

import java.util.Observable;

public class Account extends Observable {

	private String operation;
	
	public void editRecord(String operation,String record){
		this.operation = operation;
		setChanged();
		notifyObservers();
	}


	public String getOperation() {
		return operation;
	}
	
	
}
