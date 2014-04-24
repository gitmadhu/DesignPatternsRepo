package com.desingpatterns.objectcreational.abstractfactory;

import com.desingpatterns.objectcreational.abstractfactory.model.Car;
import com.desingpatterns.objectcreational.abstractfactory.model.DieselCar;

public class PatrolCarFactory extends CarFactory {

	@Override
	public Car getCar(String model) {
		Car car = new DieselCar("SEDAN");
		return car;
	}

}
