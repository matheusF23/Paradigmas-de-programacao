package com.paradigmas.lab.aula7;

public class TestAula7 {
	public static void main(String[] args) {
		System.out.println("Come�ando ...");
		Circle c = new Circle(10);
		System.out.println("�rea do circulo: " + c.area());
		
		PlaneCircle pc = new PlaneCircle(1.0, 0.0, 0.0);	// Unit circle at the origin
		System.out.println("circunfer�ncia: " + pc.circumference());
	    System.out.println("�rea: " + pc.area());			// Como PlaneCircle � filha de Circle eu posso usar os m�todOs de Circle.
	    double ratio = pc.circumference() / pc.area();
	    System.out.println("ratio: " + ratio);
	    
	    Rectangle rec = new Rectangle(5.0, 3.0);
	    System.out.println("�rea do retangulo: " + rec.area());
		
	    System.out.println("----------------------");
	    
	    
	    
	    
	    
	}
}
