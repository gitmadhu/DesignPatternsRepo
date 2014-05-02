package com.designpatterns.objectstructural.adaptor.mani.example;

public class Socket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangularSocket rectangularSocket = new RectangularSocket();
		rectangularSocket.setRectangularSocketOne("Rectangle Pin 1");
		rectangularSocket.setRectangularSocketTwo("Rectangle Pin 2");
		System.out.println(rectangularSocket.getRectangularSocketOne());
		System.out.println(rectangularSocket.getRectangularSocketTwo());
		
		CircularSocket circularSocket = new CircularSocket();
		circularSocket.setCircularSocketOne("Circle Pin 1");
		circularSocket.setCircularSocketTwo("Circle Pin 2");
		System.out.println(circularSocket.getCircularSocketOne());
		System.out.println(circularSocket.getCircularSocketTwo());
		
		
		Adaptor adaptor = new Adaptor();
		
		
		CircularSocket circularSocket2 = adaptor.rectangulartoCircular(rectangularSocket);
		System.out.println(circularSocket2.getCircularSocketOne());
		System.out.println(circularSocket2.getCircularSocketTwo());
	}
}
