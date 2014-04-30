package com.designpatterns.objectstructural.adaptor.mani;

public class Adaptor {
	
	CircularSocket circularSocket;
	RectangularSocket rectangularSocket;
	
	public CircularSocket getCircularSocket() {
		return circularSocket;
	}
	public void setCircularSocket(CircularSocket circularSocket) {
		this.circularSocket = circularSocket;
	}
	public RectangularSocket getRectangularSocket() {
		return rectangularSocket;
	}
	public void setRectangularSocket(RectangularSocket rectangularSocket) {
		this.rectangularSocket = rectangularSocket;
	}
	public CircularSocket rectangulartoCircular(RectangularSocket rectangularSocket)
	{
		CircularSocket circularSocket = new CircularSocket();
		circularSocket.circularSocketOne = rectangularSocket.rectangularSocketOne;
		circularSocket.circularSocketTwo = rectangularSocket.rectangularSocketTwo;
		return circularSocket;
	};
}