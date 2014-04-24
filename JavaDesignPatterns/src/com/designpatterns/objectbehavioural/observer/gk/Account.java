package com.designpatterns.objectbehavioural.observer.gk;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {

	private String operation;
	
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	public void editRecord(String operation){
		this.operation = operation;
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers){
			o.update(operation);
		}
	}

}
