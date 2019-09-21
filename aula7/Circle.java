package com.paradigmas.lab.aula7;

public class Circle extends Geometry {
	
	public static final double PI = 3.14159; // A constant
    public double r; // An instance field that holds the radius of the circle
    // The constructor method: initialize the radius field 
    public Circle(double r) { this.r = r; }
    // The instance methods: compute values based on the radius 
    public double circumference() { return 2 * PI * r; }
    public double area() { return PI * r*r; }
    
    
}
