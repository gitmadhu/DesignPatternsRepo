package com.desingpatterns.objectcreational.abstractfactory.model;

import com.desingpatterns.objectcreational.abstractfactory.CarFactory;

public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = CarFactory.getCarFactory(CarType.DIESEL).getCar("SEDAN");
		System.out.println("car created"+car.getModel());
		System.out.println("car created"+car.getType());
	}

}
