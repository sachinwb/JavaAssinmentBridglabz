

//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)

package com.bridglabz.assignment2.jav;
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		int a = scan.nextInt();
		System.out.println("Enter value of b : ");
		int b = scan.nextInt();
		System.out.println("Enter value of c : ");
		int c = scan.nextInt();
		
		double delta=b*b-4.0*a*c;
		double r=-b/(2.0*a);
		double r1;
		double r2;
		if(delta > 0.0)
		{
			r1=r+Math.sqrt(delta)/2*a;
			r2=r-Math.sqrt(delta)/2*a;
			System.out.println("Roots are real and distinct first root is r1 : "+r1);
			System.out.println("Roots are real and distinct second root is r2 : "+r2);
		}
		else if(delta == 0.0)
		{
			r1=r2=-r;
			System.out.println("Roots are real and equal r1 is equals to r2 : "+r1);
		}
		else
		{
			System.out.println("Roots are not real..");
		}

	}

}
