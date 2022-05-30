package inheritance;
import inheritanc.First;

public class Secondprog extends Firstprog {
	void d3()
	{
		System.out.println("d3 is executed");
		
	}
     void d4()
   {
	System.out.println("d4 is executed");
    }
     void multiply()
     {
    	 int a=10;
    	 int b=4;
    	int c=a*b;
    	 System.out.println("multiplication of two numbers "+c);
     }
     void d1()
     
     {
    	 System.out.println("di1 is exectecuted");
    	 
     }
     
     
     

	public static void main(String[] args) {
		
		Secondprog temp=new Secondprog();
		temp.d1();
		temp.d2();
		temp.d3();
		temp.d4();
		temp.sum();
		temp.sub(10,5);
		temp.multiply();
		First fs=new First();
		fs.addition();
		

	}

}
