package firstprogram;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		
		
	Scanner num = new Scanner(System.in);
		  System.out.println("enter a number");
		  int i=num.nextInt();
		  System.out.println("value entered is"   + i);
     int n;
     n=i/2;
     
   
		  if(n==0||n==1)
		  {
			  System.out.println("The number is not a prime number: "+ i);
		  }	  
	else
		System.out.println("The number is  prime number: " + i);
	}
	}


