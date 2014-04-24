package com.desingpatterns.objectcreational.singleton.madhu;

public class EnumSingleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EnumSingle singletonObj = EnumSingle.INSTANCE;
		singletonObj.doSomeWork();
		
		EnumSingle singletonObj1 = EnumSingle.INSTANCE;
		EnumSingle singletonObj2 = EnumSingle.INSTANCE;
		EnumSingle singletonObj3 = EnumSingle.INSTANCE;
		
		System.out.println(singletonObj1);
		System.out.println(singletonObj2);
		System.out.println(singletonObj3);
	}

}
