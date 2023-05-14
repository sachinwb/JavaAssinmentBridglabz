//Java Program to print the elements of an array present on odd position
package com.bridglabz.assignment3.java;

public class OddIndexElementArray {

	public static void main(String[] args) {
		int num1[]= {1,4,2,5,3,6};
		
		for(int i =1;i<num1.length;i+=2)
		{
			System.out.println("The element present at odd index are : "+num1[i]);
		}

	}

}
