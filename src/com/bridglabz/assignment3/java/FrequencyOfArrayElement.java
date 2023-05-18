//Java Program to find the frequency of each element in the array

package com.bridglabz.assignment3.java;
import java.util.*;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		int num[]= {1,1,2,2,3,4,3,2,1,5,6,3,4};
		List<Integer> list = new ArrayList<Integer>();
 		for(int i=0;i<num.length;i++)
		{
			boolean value = list.contains(num[i]);
			if(value==false)
			{
				list.add(num[i]);
			}
		}
		
		for(int x:list)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		
		for(int x=0;x<list.size();x++)
		{
			int count=0;
			for(int y=0;y<num.length;y++)
			{
				if(list.get(x)==num[y])
				{
					count+=1;
				}
			}
			System.out.println("The number of occurence of "+x+" is : "+count);
//			System.out.println();
		}

//		System.out.println(list.get(0));
	}

}
