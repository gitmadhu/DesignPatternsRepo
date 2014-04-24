package com.desingpatterns.objectcreational.abstractfactory.model.madhu;

public class PatrolCar extends Car {

	public PatrolCar(String model, CarType type) {
		super(model, CarType.PATROL);
		buildParts();
	}

	public PatrolCar(String model) {
		super(model, CarType.PATROL);
		buildParts();
	}

	@Override
	protected void buildParts() {
		System.out.println("building petrole car...");
		patrolParts();

	}
	
	private void patrolParts(){
		// construct
	}

}
