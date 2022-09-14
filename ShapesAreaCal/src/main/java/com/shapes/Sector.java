package com.shapes;

//Sector
//Area = ½ × r2 × θ
//r = radius
//θ = angle in radians


public class Sector implements Shapes {
	private double r, theta;
	
	
	
	public Sector(double r, double theta) {
		super();
		this.r = r;
		this.theta = theta;
	}



	public double calculateArea() {
		
		return 0.5*(Math.pow(r, 2))*theta;
	}

}
