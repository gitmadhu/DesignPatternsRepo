package com.desingpatterns.objectcreational.abstractfactory.model.madhu;

public class DieselCar extends Car {

	public DieselCar(String model, CarType type) {
		super(model, CarType.DIESEL);
		buildParts();
	}

	public DieselCar(String model) {
		super(model, CarType.DIESEL);
		buildParts();
	}

	@Override
	public void buildParts() {
		System.out.println("building Disel car..");
		dieselParts();
	}
	
	private void dieselParts(){
		// construct
	}

}
