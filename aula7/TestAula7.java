package com.paradigmas.lab.aula7;

public class TestAula7 {
	public static void main(String[] args) {
		System.out.println("Começando ...");
		Circle c = new Circle(10);
		System.out.println("Área do circulo: " + c.area());
		
		PlaneCircle pc = new PlaneCircle(1.0, 0.0, 0.0);	// Unit circle at the origin
		System.out.println("circunferência: " + pc.circumference());
	    System.out.println("Área: " + pc.area());			// Como PlaneCircle é filha de Circle eu posso usar os métodOs de Circle.
	    double ratio = pc.circumference() / pc.area();
	    System.out.println("ratio: " + ratio);
	    
	    Rectangle rec = new Rectangle(5.0, 3.0);
	    System.out.println("Área do retangulo: " + rec.area());
		
	    System.out.println("----------------------");
	    
	    
	    
	    
	    
	}
}
