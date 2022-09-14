package com.shapes;

//Trapezoid (US)
//Trapezium (UK)
//Area = ½(a+b) × h
//h = vertical height
public class Trapezoid implements Shapes {
	private double a,b,h;
	public Trapezoid(double a ,double b, double h) {
		this.a=a;
		this.b=b;
		this.h=h;
	}

	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*(a+b)*h;
	}

}
