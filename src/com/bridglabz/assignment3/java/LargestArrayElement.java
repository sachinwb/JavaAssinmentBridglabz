
//Java Program to print the largest element in an array
package com.bridglabz.assignment3.java;

public class LargestArrayElement {

	public static void main(String[] args) {
		int num1[]= {1,4,3,2,5,6,1};
		int num2[]= {0};
		
		for(int i=0;i<num1.length;i++)
		{
			if(num1[i]>num2[0])
			{
				num2[0]=num1[i];
			}
			else
			{
				continue;
			}
		}

		System.out.println("The largest element of num1 array is : "+num2[0]);
	}

}
