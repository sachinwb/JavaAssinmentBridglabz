
// Enter two numbers and do the following arithmetic Operations find max and min
// i) a+b*c ii) c+a/b
// iii) a%b+c iV) a*b+c

package com.bridglabz.assignment2.jav;
import java.util.*;
public class ArthematicOperation {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter value of a : ");
     a=scan.nextInt();
     System.out.println("Enter value of b : ");
     b=scan.nextInt();
     System.out.println("Enter value of c : ");
     c=scan.nextInt();
     
     
     
     int d =a+b*c;
     double e =c+a/b;
     double f =a%b+c;
     int g =a*b+c;
     System.out.println("a+b*c is : "+d);
     System.out.println("c+a/b is : "+e);
     System.out.println("a%b+c is : "+f);
     System.out.println("a*b+c is : "+g);
     
     if(d>e &&d>f &&d>g) {
    	 System.out.println("max number is d : "+d);
     }
     else if(e>f && e>g) {
    	 System.out.println("max number is e : "+e);
     }
     else if(f>g)
     {
    	 System.out.println("max number is f : "+f);
     }
     else {
    	 System.out.println("max number is g : "+g);
     }
     
     if(d<e &&d<f &&d<g) {
    	 System.out.println("min number is d : "+d);
     }
     else if(e<f && e<g) {
    	 System.out.println("min number is e : "+e);
     }
     else if(f<g)
     {
    	 System.out.println("min number is f : "+f);
     }
     else {
    	 System.out.println("min number is g : "+g);
     }

	}

}
