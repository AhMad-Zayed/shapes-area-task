package com.shapes;
//Parallelogram
//Area = b × h
//b = base
//h = vertical height
public class Parallelogram implements Shapes{
        private double b,h;
        public Parallelogram (double base, double vertical ) {
        	this.b = base;
        	this.h = vertical;
        }
        
	public double calculateArea() {
	
		return b*h;
	}

}
