package com.paradigmas.lab.exercicios_heranca_interfaces.exercicio3;

public abstract class Quadrilateral implements GeometricShapes{
	private double s1, s2, s3, s4;

	public Quadrilateral(double s1, double s2, double s3, double s4) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	// Getters and Setters
	public double getS1() {return s1;}
	public void setS1(double s1) {this.s1 = s1;}
	public double getS2() {return s2;}
	public void setS2(double s2) {this.s2 = s2;}
	public double getS3() {return s3;}
	public void setS3(double s3) {this.s3 = s3;}
	public double getS4() {return s4;}
	public void setS4(double s4) {this.s4 = s4;}
	
	// Perimeter calculation
	@Override
	public abstract double perimeter();
	
}
