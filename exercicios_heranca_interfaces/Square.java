package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Square extends Quadrilateral{
	private double side;
	
	public Square(double side) {
		super(side, side, side, side);
		this.side = side;
	}

	@Override
	public double area() {
		return Math.pow(side, 2);
	}

}
