package com.shapes;

public class Square implements Shapes {
	final private double side;

	public Square(double side) {
		this.side = side;
	}

	public double calculateArea() {

		return side * side;
	}

}
