package com.shapes;

public class Main {

	public static void main(String[] args) {
		Shapes square = new Square(10);
		Shapes triangle = new Triangle(10,5); 
		System.out.println(square.calculateArea());
		
		System.out.println(triangle.calculateArea());
		
	}

}
