package com.desingpatterns.objectcreational.abstractfactory.model;

public abstract class Car {
	
	private String model; // SMALL OR SEDAN
	private CarType type;  // DIESEL OR PATROL
	
	public Car(String model, CarType type) { 
		this.model = model;
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	
	protected abstract void buildParts();

}
