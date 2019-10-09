package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Square extends Quadrilateral{
	
	public Square(double side) {
		super(side, 0, 0, 0);
		
	}

	@Override
	public double area() {
		return Math.pow(this.getS1(), 2);
	}

	@Override
	public double perimeter() {
		return 4 * this.getS1();
	}

}
