package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Rectangle extends Quadrilateral{
	
	public Rectangle(double base, double height) {
		super(base, height, 0, 0);
		
	}

	@Override
	public double perimeter() {
		return 2 * (this.getS1() + this.getS2());
	}

	@Override
	public double area() {
		return this.getS1() * this.getS2();
	}	
}
