package javaInterviewsCodes;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		//2.Java Program to Check Whether a Number is Even or Odd
	    
	     
		 Scanner scan =new Scanner(System.in);
	     System.out.println("Enter a number");
	     int n=scan.nextInt();
	     
	     if(n%2==0) {
	    	 System.out.println(n+" is Even");
	     }
	     else {
	    	 System.out.println(n+" is Oddd");
	     }
		
		

	}

}
