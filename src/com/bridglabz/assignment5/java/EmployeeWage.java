package com.bridglabz.assignment5.java;
import java.util.*;
public class EmployeeWage {
	
	{
		System.out.println("Welcome to Employee Wage computation Programe");
	}
	int hourWage=20;
	int dailyHour=8;
	
	

	public static void main(String[] args) {
		EmployeeWage ref =new EmployeeWage();
		int dailyEmpWage=ref.hourWage*ref.dailyHour;
		System.out.println(dailyEmpWage);

	}

}
