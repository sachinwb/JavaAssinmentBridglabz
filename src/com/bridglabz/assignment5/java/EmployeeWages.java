package com.bridglabz.assignment5.java;
import java.util.*;
public class EmployeeWages {
	
	{
		System.out.println("Welcome to Employee Wage computation Programe");
	}
	
	int perHourWage=20;
	int dailyHour=8;
	int partimeDailyHour=4;
	int totalWage;
	
	Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	

	
	public int present() {
		int count =0;
		for(int i =0;i<20;i++) {
			int temp=rand.nextInt(2);
			switch(temp) {
			case 1:
				count++;
				break;
			default:
				break;
			}			
		}
		return count;		
	}
	
	public void monthlyWage(int day) {
	     totalWage=perHourWage*dailyHour*(day+8);
	     System.out.println("Total monthly wage for full time employee is : "+totalWage);
	}
	
	public void partMonthlyWage(int day) {
	     totalWage=perHourWage*partimeDailyHour*(day+8);
	     System.out.println("Total monthly wage for part time employee is : "+totalWage);
	}
	

	public static void main(String[] args) {
		EmployeeWages ref =new EmployeeWages();
		int r=ref.present();
		System.out.println(r);
		System.out.println("Are you a fultime employee or part time [yes|no]");
		String s=scan.next();
		
		switch(s) {
		case "yes":
			if(r>12) 
				ref.monthlyWage(r);
				else
					System.out.println("Please come regularly to get paid");
			break;
		case "no":
			if(r>12) 
				ref.partMonthlyWage(r);
				else
					System.out.println("Please come regularly to get paid");
			break;
		default:
			System.out.println("Enter valid input ");
		}		
	}

}
