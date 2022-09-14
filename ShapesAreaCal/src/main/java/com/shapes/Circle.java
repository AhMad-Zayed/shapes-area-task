package com.shapes;

//Circle
//Area = π × r^2
//r = radius

public class Circle implements Shapes {
	private double r;
	public final static double pi =3.14 ;
	

	public Circle(double r) {
		
		this.r = r;
	}



	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi *Math.pow(r,2);
	}

}
