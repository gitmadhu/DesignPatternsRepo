package com.designpatterns.objectstructural.adaptor.mani;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Adaptors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		System.out.println("This is Hash Map after Conversion From List..."+adaptor(list));
	}
	private static HashMap<Integer, String> adaptor(List<String> list) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		for (String string : list) {
			hashmap.put(list.indexOf(string), string);
		}
		System.out.println(hashmap);
		return hashmap;
	}
}