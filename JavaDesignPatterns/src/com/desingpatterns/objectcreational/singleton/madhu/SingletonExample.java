package com.desingpatterns.objectcreational.singleton.madhu;
/**
 * Singleton using Lazy
 * @author Madhu B
 *
 */
public class SingletonExample {
	 
    // Static member holds only one instance of the
    private static SingletonExample singletonInstance;
 
    // SingletonExample prevents any other class from instantiating
    private SingletonExample() {
    }
 
    // Providing Global point of access
    public static SingletonExample getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonExample();  // lazy loading.
            System.out.println("creating a new object");
        }
        return singletonInstance;
    }
    
    // using double check locking
    public static SingletonExample getSyncSafeInstance(){
    	 if (null == singletonInstance) {
             synchronized (SingletonExample.class){
                     if (null == singletonInstance) {
             singletonInstance = new SingletonExample();
             }
         }
         }
         return singletonInstance;
    }
 
    public void printSingleton(){
        System.out.println("Inside print Singleton");
    }
}
