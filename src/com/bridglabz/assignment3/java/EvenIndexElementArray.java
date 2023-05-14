
//Java Program to print the elements of an array present on an even position
package com.bridglabz.assignment3.java;

public class EvenIndexElementArray {

	public static void main(String[] args) {
		
		int num[]= {1,3,5,4,2,6};
		
		for(int i=0;i<num.length;i+=2)
		{
			System.out.println("The element present at even position are : "+num[i]);
		}

	}

}
