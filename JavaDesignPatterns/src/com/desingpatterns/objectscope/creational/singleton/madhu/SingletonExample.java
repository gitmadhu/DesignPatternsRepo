package com.desingpatterns.objectscope.creational.singleton.madhu;

public class SingletonExample {
	 
    // Static member holds only one instance of the
    private static SingletonExample singletonInstance;
 
    // SingletonExample prevents any other class from instantiating
    private SingletonExample() {
    }
 
    // Providing Global point of access
    public static SingletonExample getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonExample();
            System.out.println("creating a new object");
        }
        return singletonInstance;
    }
 
    public void printSingleton(){
        System.out.println("Inside print Singleton");
    }
}
