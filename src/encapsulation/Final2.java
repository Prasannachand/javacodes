package encapsulation;

public class Final2 extends Abstract2{
	int x=1;
	int y;
	void method3()
	{
		
		int a=10;
		int b=20;
		
		int c=a+b;
		System.out.println("sum of two numbers"+c); 
		System.out.println("value"+x); 
		
		
	}
	void method4()
	{
		x=10;
		y=2;
		System.out.println("subtraction of 2 numbers "+(x-y));
		System.out.println("subtraction of 2 numbers "+x);
		
	}
	

	public static void main(String[] args) {
		Final2 t=new Final2();
		t.method3();
		t.display();
		t.method4();

		


	}

}
