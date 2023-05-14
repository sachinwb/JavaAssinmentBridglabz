
//Java Program to print the smallest element in an array
package com.bridglabz.assignment3.java;

public class SmallestArrayElement {

	public static void main(String[] args) {
		
		int num1[]= {1,4,3,2,5,6,1};
		int num2[]= {0};
		num2[0]=num1[0];
		for(int i=0;i<num1.length;i++)
		{
			if(num1[i]<num2[0])
			{
				num2[0]=num1[i];
			}
			else
			{
				continue;
			}
		}

		System.out.println("The smallest element of num1 array is : "+num2[0]);

	}

}
