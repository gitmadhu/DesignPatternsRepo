package com.designpatterns.objectcreational.abstractfactory.madhu;

import com.designpatterns.objectcreational.abstractfactory.model.madhu.Car;
import com.designpatterns.objectcreational.abstractfactory.model.madhu.DieselCar;
import com.designpatterns.objectcreational.abstractfactory.model.madhu.PatrolCar;
import com.designpatterns.objectcreational.abstractfactory.model.madhu.PatrolCarEngine;

public class PatrolCarFactory extends CarFactory {

	@Override
	public Car getCar(String model) {
		Car car = new PatrolCar(model);
		car.setCarEngine(new PatrolCarEngine());
		return car;
	}

}
