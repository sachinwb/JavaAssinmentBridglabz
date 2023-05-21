/*
 * a. Just like the Armstrong number, the Perfect Number is also a special type of positive number. When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number. For example, 28 is the perfect number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
 */

package com.bridglabz.assignment4.java;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number to check its a perfect number or not :");
		int num = scan.nextInt();
		
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
				
			}
		}
		

		if(num == sum) {
			System.out.println(num+" is a perfect number");
		}
		else {
			System.out.println(num+" is not a perfect number");
		}
	}

}
