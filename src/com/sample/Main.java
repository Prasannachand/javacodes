package com.sample;
 class One
{
    class Two
   {
	   int a=1;
	   String b=" good";
	   void first()
	   {
		   System.out.println("sting value is"+b);
	   }
	

	}
    int c=10;
    String d="bad";
    void second()
    {
    	System.out.println("value of integer"+c);
    }
    
	   
   }


	


















public class Main {

	public static void main(String[] args) {
		One o=new One();
		One.Two t=o.new Two();
		o.second();
		t.first();
		
		

	}

}
