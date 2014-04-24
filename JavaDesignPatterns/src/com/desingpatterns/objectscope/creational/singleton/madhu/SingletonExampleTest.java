package com.desingpatterns.objectscope.creational.singleton.madhu;

import com.desingpatterns.objectscope.creational.singleton.madhu.SingletonExample;

public class SingletonExampleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonExample.getSingletonInstance().printSingleton();
		SingletonExample.getSingletonInstance().printSingleton();
		SingletonExample.getSingletonInstance().printSingleton();
		
	}

}
