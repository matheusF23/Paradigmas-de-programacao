package com.paradigmas.lab.aula7;

public class Rectangle extends Geometry{
	
	private double base;
	private double altura;
	
	public Rectangle(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return base * altura;
	}

}
