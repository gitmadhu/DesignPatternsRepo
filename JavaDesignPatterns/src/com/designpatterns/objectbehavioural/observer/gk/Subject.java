package com.designpatterns.objectbehavioural.observer.gk;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
