
//Java Program to sort the elements of an array in ascending order 
package com.bridglabz.assignment3.java;
import java.util.Arrays;
public class SortArrayElementAccending {

	public static void main(String[] args) {
		int num[]= {10,2,8,4,9,3,7,5,6,1};

		Arrays.sort(num);
		for(int x:num) {
		System.out.print(x+" ");
		}
	}

}
