package com.interfac;

public class Operationsmain implements Sum,Mul{
	int k;
	int l;
	int m;
	int n;
	public void sum1(int i,int j)
	{
		this.k=i;
		this.l=j;
		k=10;
		l=20;
		System.out.println("value of x is"+(k+l));
	}
	public void sum2(int i,int j)
	{
		this.k=i;
		this.l=j;
		k=10;
		l=2;
		
		System.out.println("value of y is"+(k*l));
	}
	 public void mul_a(int x,int y)
	{
		this.m=x;
		this.n=y;
		m=89;
		n=10;
		
	    System.out.println("value of i is "+m);
	}
	public void mul_b(int x,int y)
	{
		this.m=x;
		this.n=y;
		m=01;
		n=20;
		
		System.out.println("subtraction of two numbers"+(m*n));
	}
	

	public static void main(String[] args) {
		//Operationsmain o=new Operationsmain();
		//o.mul_a(3, 2);
		//o.sum1(6, 7);
		Sum s= new Operationsmain();
		s.sum1(2, 3);
		s.sum2(4, 5);
		Mul m=new Operationsmain();
		m.mul_a(5, 6);
		m.mul_b(6, 2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
