package com.shapes;

//Area = ½ × b × h
//b = base
//h = vertical height
public class Triangle implements Shapes {
private double b=0;
private double h=0;
public Triangle(double b , double h) {
	this.b = b;
	this.h= h;
	
}

public double calculateArea() {
	
	return 0.5* b * h;
}
}
