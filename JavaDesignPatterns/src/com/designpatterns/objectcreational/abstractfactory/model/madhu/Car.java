package com.designpatterns.objectcreational.abstractfactory.model.madhu;

public abstract class Car {
	
	private String model; // SMALL OR SEDAN
	private CarType type;  // DIESEL OR PATROL
	private CarEngine carEngine;
	
	public CarEngine getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(CarEngine carEngine) {
		this.carEngine = carEngine;
	}
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
