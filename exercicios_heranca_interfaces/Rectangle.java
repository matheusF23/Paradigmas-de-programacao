package com.paradigmas.lab.exercicios_heranca_interfaces;

public class Rectangle extends Quadrilateral{
	private double base;
	private double height;
	public Rectangle(double base, double height) {
		super(base, height, base, height);
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return base * height;
	}	
}
