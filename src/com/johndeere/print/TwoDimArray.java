package com.johndeere.print;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String[][] arr1={ {"john","john123"}, {"peter","peter123"}, {"mark","mark123"} };

		System.out.println(arr1[0][0]);
		System.out.println(arr1[2][0]);
		
		String[][] arr=new String[3][2];
	
		arr[0][0]="John";
		arr[0][1]="John123";
		
		arr[1][0]="Peter";
		arr[1][1]="peter123";
		
		arr[2][0]="mark";
		arr[2][1]="mark123";
		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][0]);
		
	}

}
