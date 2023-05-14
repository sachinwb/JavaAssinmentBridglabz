//Java Program to print the elements of an array in reverse order
package com.bridglabz.assignment3.java;
import java.util.*;
public class ReverseArrayElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of element for the array :");
		int size = scan.nextInt();
		
		int num[] = new int[size];
		
		for(int i =0;i<size;i++)			
		{
			System.out.println("Enter element to add in array of index : "+i);
			num[i]=scan.nextInt();
		}
        System.out.println();  
		
        System.out.print("Element entered are : ");
		for(int i =0;i<size;i++){
		System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(num[i]);
		}
		

	}

}
