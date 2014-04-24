package com.designpatterns.objectcreational.abstractfactory.model.madhu;

public class PatrolCarEngine extends CarEngine {
	
	@Override
	public void fillFuel() {
		fillPatrol();

	}

	private void fillPatrol() {
		System.out.println("filling patrole..");
		setHasFuel(true);
	}

}
