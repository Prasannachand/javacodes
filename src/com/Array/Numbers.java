package com.Array;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(31);
		i.add(4);
		i.add(51);
		i.add(6);
		i.add(71);
		for(int r:i)
		{
			System.out.println(r);
		}
		
		ArrayList<Integer> j=new ArrayList<Integer>();
		j.add(7);
		j.add(11);
		j.add(31);
		j.add(10);
		for(int s:j)
		{
			System.out.println(s);
		}
		i.addAll(j);
		System.out.println(i);
		
		
		//System.out.println(j);
		//}
		
	}

}
