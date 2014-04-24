package com.desingpatterns.objectcreational.abstractfactory.madhu;

import com.desingpatterns.objectcreational.abstractfactory.model.madhu.Car;
import com.desingpatterns.objectcreational.abstractfactory.model.madhu.DieselCar;

public class PatrolCarFactory extends CarFactory {

	@Override
	public Car getCar(String model) {
		Car car = new DieselCar("SEDAN");
		return car;
	}

}
