package com.paradigmas.lab.exercicios_heranca_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestGeometricShapes {

	public static void main(String[] args) {
		List<GeometricShapes> shapes = new ArrayList<GeometricShapes>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many geometric shapes do you want to create?");
		int amountShapes = input.nextInt();
		input.nextLine(); // esvazia o buffer
		
		for(int i = 0; i < amountShapes; i++) {
			System.out.println("What geometric shape do you want to create?");
			System.out.println("Square - s \nRectangle - r \nCircle - c.");
			String ans = input.next();
			
			if(ans.equals("s") || ans.equals("S")) {
				
				System.out.println("Enter size of square side: ");
				double side = input.nextDouble();
				input.nextLine();
				
				Square sq = new Square(side);
				shapes.add(sq);
			} else if(ans.equals("r") || ans.equals("R")) {
				
				System.out.println("Insert the base of the rectangle: ");
				double base = input.nextDouble();
				System.out.println("Insert the height of the rectangle: ");
				double height = input.nextDouble();
				input.nextLine();
				
				Rectangle rec = new Rectangle(base, height);
				shapes.add(rec);
			} else if(ans.equals("c") || ans.equals("C")) {
				
				System.out.println("Insert the radius of the circle: ");
				double rad = input.nextDouble();
				input.nextLine();
				
				Circle cir = new Circle(rad);
				shapes.add(cir);
			}
		}
	}
}
