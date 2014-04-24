package com.designpatterns.objectcreational.abstractfactory.model.madhu;

public class DieselCarEngine extends CarEngine {

	@Override
	public void fillFuel() {
		fillDiesel();
	}
	
	protected void fillDiesel(){
		System.out.println("filling diesel ...");
		setHasFuel(true);
	}

}
