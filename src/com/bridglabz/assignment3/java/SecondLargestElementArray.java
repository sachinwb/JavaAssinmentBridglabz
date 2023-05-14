
//Find 2nd Largest Number in an Array
package com.bridglabz.assignment3.java;
import java.util.*;
public class SecondLargestElementArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size=scan.nextInt();
		
		int num[]= new int[size];
		
		for(int i =0;i<size;i++) {
			System.out.println("Enter element to add in array: ");
			num[i]=scan.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println("The second largest element of this array is : "+num[num.length-2]);
	}

}
