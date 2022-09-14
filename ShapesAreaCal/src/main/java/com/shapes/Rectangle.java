package com.shapes;
//Rectangle
//Area = w × h
//w = width
//h = height

public class Rectangle implements Shapes {
	private double w,h;
	
	public Rectangle(double w,double h) {
		this.w = w;
		this.h =h;
		
	}

	public double calculateArea() {
	
		return w*h;
	}

}
