
// Write a program Distance.java that takes two integer command-line arguments x and y 
// and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.

package com.bridglabz.assignment2.jav;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter x cordinate : ");
//		int x = scan.nextInt();
//		System.out.println("Enter y cordinate : ");
//		int y = scan.nextInt();
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		
		double distance = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Euclidean distance is : "+distance);

	}

}
