package firstprogram;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
	 
	 
		
		  Scanner startnum= new Scanner(System.in);
		  System.out.println("enter a start number"); 
		  int i=startnum.nextInt();
		  System.out.println("value entered is" + i);
		 
		  Scanner endnum= new Scanner(System.in);
		  System.out.println("enter a end number");
		  int j=endnum.nextInt();
		  System.out.println("value entered is" + j);

	 int k=0;
	 
		  for(k=i; k<=j; k++) { 
			  System.out.println("looped numbers is" + k); }
		  
	 		}

}
