package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Square extends Quadrilateral{

	public Square(double side) {
		super(side, 0.0, 0.0, 0.0);
	}

	@Override
	public double area() {
		return 0;
	}

}
