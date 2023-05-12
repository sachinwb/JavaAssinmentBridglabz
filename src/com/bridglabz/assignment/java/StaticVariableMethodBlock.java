package com.bridglabz.assignment.java;

public class StaticVariableMethodBlock {
	
	static int n =10;
	
	static void display() {
		System.out.println("Displaying static method");
	}
	
	static
	{
		System.out.println("Displaying static Blocks");
		System.out.println("Displaying static variable inside static block : "+n);		
	}
	
	{
		System.out.println("Displaying non static block");
	}
	

	//Write a program to demonstrate static variables, methods, and blocks
	public static void main(String[] args) {
		
		System.out.println("main is running ");
		display();
		new StaticVariableMethodBlock();
		

	}

}
