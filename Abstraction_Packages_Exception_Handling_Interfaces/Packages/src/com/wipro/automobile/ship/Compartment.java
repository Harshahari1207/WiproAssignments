package com.wipro.automobile.ship;

public class Compartment {
	
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public String toString() {
		return "Compatment [height = " +height + ", whidth = " +width+ ", breadth = " +breadth+ "]";
	}

}
