package com.johndeere.collections;

import java.util.ArrayList;

public class Demo00 {
	
	public static void main(String[] args) {
		
		//non-generic type
		
		ArrayList colors=new ArrayList();
		
		colors.add(10);
		colors.add(10.2);
		colors.add("jack");
		
		String[] colors1 = { "green", "red", "yellow" };
		
		colors.add(colors1);
		
		int res=(int) colors.get(0);
		System.out.println(res);
		
		String[] arr=(String[]) colors.get(3);
		System.out.println(arr[0]);
		
	}

}
