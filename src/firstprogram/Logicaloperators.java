package firstprogram;

public class Logicaloperators {
	public static void main(String[] args) {
		int a=20;  
		int b=5;  
		System.out.println(a+b);
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);

		System.out.println(10*10/5+3-1*4/2);

		//Left Shift Operator
		System.out.println(10<<3);//10*(2*2*2=8) --3 times = 80
		System.out.println(40<<4);
		System.out.println(-30<<3);//30*(2*2*2=8)

		//Right Shift Operator
		System.out.println(20>>3);//20/(2*2*2=8)  =20/8=2
		System.out.println(20>>2);//20/(2*2=4)    =20/4=5
		System.out.println(20>>>2);//  20/(2*2=4)    =20/4=5
		System.out.println(-20>>>2);
		System.out.println(-30>>3);//30/(2*2*2=8)=30/8=3
		System.out.println(-80>>3);

		}




		
	}


