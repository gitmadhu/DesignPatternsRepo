package com.reflection.gk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class personClass = Person.class;
		System.out.println("Person Class Details : ");
		System.out.println("Canonical Name : "+personClass.getCanonicalName());
		System.out.println("Name : "+personClass.getName());
		
		System.out.println("Modifiers Defined on the Class : "+Modifier.toString(personClass.getModifiers()));
		
		Constructor[] constructors = personClass.getConstructors(); // returns all the Constructors 
		
		System.out.println("Constructors defined ");
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		
		// Accessing Fields : getDeclaredFields() returns array of Field instances (public,private,protected except inheriteed methods) ,
		//getFields() returns array of Field instances only public including inherited  
		Field[] fields = personClass.getDeclaredFields(); // Returns Fields such as private , public , protected where as getFields() returns only public includes inherited. 
		
		System.out.println("Fields defined ");
		for(Field field : fields){
			System.out.println(field);
		}
		
		// Accessing Private Fields
		try {
			Field age = Person.class.getDeclaredField("age");
			age.setAccessible(true);
			Person p = (Person) personClass.newInstance();
			age.setLong(p, 27);
			System.out.println("Accessing private field : "+age.get(p));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Accessing Methods
		Method[] methods = personClass.getDeclaredMethods(); // Returns Methods private , public , protected where as getMethods() returns only public includes inherited
		
		System.out.println("Methods defined ");
		for(Method method : methods){
			System.out.println(method);
		}
		
	}

}
