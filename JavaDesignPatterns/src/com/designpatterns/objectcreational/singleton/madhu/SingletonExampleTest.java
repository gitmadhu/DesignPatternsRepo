package com.designpatterns.objectcreational.singleton.madhu;

import com.designpatterns.objectcreational.singleton.madhu.SingletonExample;

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
