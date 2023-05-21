/*In Java, we can reverse a number either by using for loop, while loop, or using recursion. The simplest way to reverse a number is by using for loop or while loop. In order to reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 * 
 */
package com.bridglabz.assignment4.java;

public class ReverseNumber {

	public static void main(String[] args) {
		int num =1234;
		int num1=0;		
		while (num> 0) {
			num1=num1*10 +num%10;
			num=num/10;
		}
		System.out.println(num1);

	}

}
