package com.desingpatterns.objectcreational.abstractfactory;

import com.desingpatterns.objectcreational.abstractfactory.model.Car;
import com.desingpatterns.objectcreational.abstractfactory.model.CarType;

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
