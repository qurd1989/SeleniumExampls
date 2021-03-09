package javaInterviewsCodes;

public class ReverseNumber {
	public static void main(String[] args) {
		//1.Java Program to Reverse a Number
		
		int num=12345;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
    System.out.println("Reverse iss:" +rev);
    
    
	}

}
