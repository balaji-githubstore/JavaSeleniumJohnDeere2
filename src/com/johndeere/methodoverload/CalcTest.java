package com.johndeere.methodoverload;

public class CalcTest {
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.add(1, 1);
		
		long output= Math.max(10, 100L);
		System.out.println(output);
	}

}
