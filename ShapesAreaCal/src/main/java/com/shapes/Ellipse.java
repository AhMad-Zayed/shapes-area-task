package com.shapes;

//Ellipse
//Area = πab

public class Ellipse implements Shapes {
	public final static double pi =3.14;
	private double a,b;
	
	
	public Ellipse(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}


	public double calculateArea() {
		
		return pi*a*b;
	}

}
