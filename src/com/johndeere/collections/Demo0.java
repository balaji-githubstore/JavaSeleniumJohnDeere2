package com.johndeere.collections;

import java.util.ArrayList;

import com.johndeere.employee.Employee;

public class Demo0 {
	
	public static void main(String[] args) {
		
		int a=10;
		
		double b=10.2;
		
		String name="hello";
		
		Employee e=new Employee();
		
		Object obj=b; //boxing 
		
		double z=  (double) obj; //unboxing
		System.out.println(z+a);
	}
}
