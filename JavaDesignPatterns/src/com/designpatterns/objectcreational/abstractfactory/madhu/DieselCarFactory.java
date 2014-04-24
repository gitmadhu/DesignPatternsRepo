package com.designpatterns.objectcreational.abstractfactory.madhu;

import com.designpatterns.objectcreational.abstractfactory.model.madhu.Car;
import com.designpatterns.objectcreational.abstractfactory.model.madhu.PatrolCar;

public class DieselCarFactory extends CarFactory {

	@Override
	public Car getCar(String model) {
		Car car = new PatrolCar(model);
		
		return car;
	}

}
