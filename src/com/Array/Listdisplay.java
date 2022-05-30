package com.Array;

import java.util.ArrayList;

public class Listdisplay {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("father");
		s.add("mother");
		s.add("elder brother");
		s.add("elder brother ");
		s.add("younger brother");
		s.add("sister");
		s.add("younger sister");
		for(String r:s)
		{
			System.out.println(r);
		}
		s.add(2,"son");
		s.get(4);
		System.out.println("name we are replacing"+s.get(4));
	s.set(4,"child");
		for(String r:s)
		{
			System.out.println(r);
		}
		
		
	}

}
