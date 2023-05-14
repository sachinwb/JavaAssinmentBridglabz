
//Java Program to sort the elements of an array in ascending order 
package com.bridglabz.assignment3.java;
//import java.util.Arrays;
public class SortArrayElementAccending {

	public static void main(String[] args) {
		int num[]= {10,2,8,4,9,3,7,5,6,1};

		int arr;
		for(int i =0;i<num.length;i++)
		{
			for(int j =i ;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					arr=num[i];
					num[i]=num[j];
					num[j]=arr;
				}
			}
		}
	  for(int x:num) {
		  System.out.print(x+" ");
	  }
		
			
	}

}
