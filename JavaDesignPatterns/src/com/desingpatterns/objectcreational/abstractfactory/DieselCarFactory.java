package com.desingpatterns.objectcreational.abstractfactory;

import com.desingpatterns.objectcreational.abstractfactory.model.Car;
import com.desingpatterns.objectcreational.abstractfactory.model.PatrolCar;

public class DieselCarFactory extends CarFactory {

	@Override
	public Car getCar(String model) {
		Car car = new PatrolCar(model);
		
		return car;
	}

}
