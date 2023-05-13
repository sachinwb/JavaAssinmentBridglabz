
/*Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
	The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the      same. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is not a Leap Year and 2000 is a Leap Year*/

package com.bridglabz.assignment.java;
import java.util.Scanner;
public class LeapYear {	
	
	//leap years 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any year greater than 1582 to check it is leap year or not : ");
		int year=scan.nextInt();
		
		if(year>=1582) 
		{
			if(year%4==0 && year %100 !=0) {
				System.out.println("leap year");
			}
			else if(year%100==0 && year%400==0) {
				System.out.println("leap year");
			}
			else {
				System.out.println("not leap year");
			}
		}
		else 
		{
			System.out.println("Please enter year grater than 1582");
		}

		
		
		
	}

}
