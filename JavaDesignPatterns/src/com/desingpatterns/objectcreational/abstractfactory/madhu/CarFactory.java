package com.desingpatterns.objectcreational.abstractfactory.madhu;

import com.desingpatterns.objectcreational.abstractfactory.model.madhu.Car;
import com.desingpatterns.objectcreational.abstractfactory.model.madhu.CarType;

public abstract class CarFactory {
	
	private static CarFactory carFactory = null;

	public static CarFactory getCarFactory(CarType type) {
		switch (type) {
		case DIESEL:
			carFactory = new DieselCarFactory();
			break;

		default:
			carFactory = new PatrolCarFactory();
		}
		return carFactory;
	}
	
	public abstract Car getCar(String model);
		
	

}
