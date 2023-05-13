
//Java Program to print the elements of an array
package com.bridglabz.assignment3.java;
import java.util.Scanner;
public class ElementOfArray {	

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter array size :");		
		int size = scan.nextInt();
		
		Object sub[] = new Object[size];
		
		for(int i =0;i<size;i++)
		{
			System.out.println("Enter elements to add in array of index :"+i);
			sub[i]=scan.next();
		}
		
//		Object sub[] = {"sachin",10,"prasant",20,"alok",23.43,"ak"};
		
		for(int i=0;i<sub.length;i++)
		{
			System.out.println(sub[i]);
//			System.out.println(((Object)sub[i]).getClass().getSimpleName());
		}
			

	}

}
