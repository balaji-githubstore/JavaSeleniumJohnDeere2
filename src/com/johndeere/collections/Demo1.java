package com.johndeere.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//red,yellow,orange
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("yellow");
		colors.add("orange");
		
		
		System.out.println(colors);
		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		
		
		colors.remove("yellow");
		
		
		System.out.println(colors.size());
		
		for(int i=0;i<colors.size();i++)
		{
			System.out.println(colors.get(i));
		}
		
		for(String color : colors)
		{
			System.out.println(color);
		}
	}

}
