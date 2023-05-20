package com.bridglabz.assignment4.java;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num=scan.nextInt();
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		int temp;
		
		for(int i =0;i<num;i++) {
			
			 {
				temp = a+b;
				a=b;
				b=temp;
				System.out.println(temp);
			}
		}

	}

}
