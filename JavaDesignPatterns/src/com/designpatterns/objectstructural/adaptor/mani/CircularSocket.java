package com.designpatterns.objectstructural.adaptor.mani;

public class CircularSocket {
	String circularSocketOne;
	String circularSocketTwo;
	public String getCircularSocketOne() {
		return circularSocketOne;
	}
	public void setCircularSocketOne(String circularSocketOne) {
		this.circularSocketOne = circularSocketOne;
	}
	public String getCircularSocketTwo() {
		return circularSocketTwo;
	}
	public void setCircularSocketTwo(String circularSocketTwo) {
		this.circularSocketTwo = circularSocketTwo;
	}
	
	public void plugin(CircularSocket cs){
		System.out.println("Plugin Successfully");
	}
}