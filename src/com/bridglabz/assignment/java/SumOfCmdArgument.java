package com.bridglabz.assignment.java;

public class SumOfCmdArgument {
	
	
    //To find the sum of command-line arguments and count the invalid integers entered
	public static void main(String[] args) {
		int sum=0;
		int count =0;
		for (int i=0;i<args.length;i++)
		{
			try {
				sum+=Integer.parseInt(args[i]);
			}catch(NumberFormatException e){
				System.out.println("Invalid integer command line argument " +e .toString());
				count+=1;
			}
			
		}
		System.out.println("sum of command-line arguments is : "+sum);
		System.out.println("Invalid integer entered are : "+count);

	}

}
