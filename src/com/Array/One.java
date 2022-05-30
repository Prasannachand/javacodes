package com.Array;


import java.util.ArrayList;
import java.util.Iterator;

public class One {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("chandu");
		s.add("prasanna");
		s.add("mokshitha");
		s.add("ruthvick");
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		
		}
		
		
		for(String k:s)
		{
			System.out.println(k);
		}
	}

}
