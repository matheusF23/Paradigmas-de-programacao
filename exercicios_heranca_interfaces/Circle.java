package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Circle implements GeometricShapes{
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2) ;
	}
}
