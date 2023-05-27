//Java Program to print the duplicate elements of an array

package com.bridglabz.assignment3.java;
import java.util.*;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size = scan.nextInt();
		
		int num[] = new int[size];
		
		System.out.println("Enter "+size+" array element:-");
		for(int i =0;i<size;i++) {
			num[i]=scan.nextInt();
		}
		
		List<Integer> aList = new ArrayList<Integer>();
				
		for(int i =0;i<num.length;i++)
		{
			boolean b =aList.contains(num[i]);
			if(b==false)
			{
				aList.add(num[i]);
			}
		}
		
		for(int x:aList)
		{
			System.out.print(x+" ");
		}
	}

}
