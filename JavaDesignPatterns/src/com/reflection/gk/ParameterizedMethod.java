package com.reflection.gk;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {

	public static List<String> getStringList(){
		List<String> stringList = new ArrayList<>();
		stringList.add("Greeshma");
		return stringList;
	}
	
	public static void main(String[] args){
		Class parameterizedMethod = ParameterizedMethod.class;
		
		try {
			Method method = parameterizedMethod.getMethod("getStringList", null);
			
			Type genericReturnType = method.getGenericReturnType();
			
			System.out.println("genericReturnType : "+genericReturnType);
			
			if(genericReturnType instanceof ParameterizedType){
				ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
				Type[] typeArguments = parameterizedType.getActualTypeArguments();
				
				for(Type typeArgument : typeArguments){
					System.out.println("typeArgument : "+typeArgument);
				}
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}