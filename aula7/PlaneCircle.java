package com.paradigmas.lab.aula7;

public class PlaneCircle extends Circle {
	// New instance fields that store the center point of the circle 
    public double cx, cy;
    public PlaneCircle(double r, double x, double y) {
            super(r); 
            this.cx = x; 
            this.cy = y;
    }
    public boolean isInside(double x, double y) {
            double dx = x - cx, dy = y - cy;
            double distance = Math.sqrt(dx*dx + dy*dy); 
            return (distance < r);
    }

}
