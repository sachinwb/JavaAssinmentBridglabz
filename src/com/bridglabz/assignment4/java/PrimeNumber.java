package com.bridglabz.assignment4.java;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num=scan.nextInt();
		int count =0;
		for(int i= 1;i<=num;i++) {
			if(num % i == 0) {
				count+=1;
			}	
	}
		if(count>1 && count <3) {
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" not a prime number");
		}

}
}
