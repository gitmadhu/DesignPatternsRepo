package com.desingpatterns.objectcreational.abstractfactory.model;

import com.desingpatterns.objectcreational.abstractfactory.CarFactory;

public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = CarFactory.getCarFactory(CarType.DIESEL).getCar("SEDAN");
		System.out.println("car created is "+car.getModel());
		System.out.println("car created is "+car.getType());
		
		 car = CarFactory.getCarFactory(CarType.PATROL).getCar("SEDAN");
		 
		 System.out.println("car created is "+car.getModel());
		 System.out.println("car created is "+car.getType());
	}

}
