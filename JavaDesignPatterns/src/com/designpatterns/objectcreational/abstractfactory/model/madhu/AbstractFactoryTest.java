package com.designpatterns.objectcreational.abstractfactory.model.madhu;

import com.designpatterns.objectcreational.abstractfactory.madhu.CarFactory;

public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = CarFactory.getCarFactory(CarType.DIESEL).getCar("SMALL");
		System.out.println("car created is "+car.getModel());
		System.out.println("car created is "+car.getType());
		
		 car = CarFactory.getCarFactory(CarType.PATROL).getCar("SEDAN");
		 
		 System.out.println("car created is "+car.getModel());
		 System.out.println("car created is "+car.getType());
	}

}
