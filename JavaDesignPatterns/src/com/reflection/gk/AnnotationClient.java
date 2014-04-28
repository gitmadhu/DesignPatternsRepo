package com.reflection.gk;

import java.lang.annotation.Annotation;

public class AnnotationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class aClass = TheClass.class;
		Annotation[] annotations = aClass.getAnnotations();

		for(Annotation annotation : annotations){
		    if(annotation instanceof MyAnnotation){
		        MyAnnotation myAnnotation = (MyAnnotation) annotation;
		        System.out.println("name: " + myAnnotation.name());
		        System.out.println("value: " + myAnnotation.value());
		    }
		}

	}

}
