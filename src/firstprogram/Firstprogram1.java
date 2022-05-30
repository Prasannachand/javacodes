package firstprogram;

public class Firstprogram1 {
	int i=10;
    float f=11.1f;
    double d=11.00;
    char c='a';
    long l=1010101;
    short s=89;
    byte b=100;
    boolean flag;
           public  void m1() {
        	   int i=5;
        	   System.out.println("HELLO");
           }
            public   void m2() {
            	int i=10;
            	float f=10.1f;
            	System.out.println("value of integer:"+i);
            }
            
      
	public static void main(String[] args) {
		
		int b=1001;
		
		Firstprogram1 x=new Firstprogram1();             //new Firstprogram1.m1();
		x.m1();
		x.m2();
         System.out.println("Hello welcome to java classes");
         System.out.println("print the value of b "+b);
		

	}

}
