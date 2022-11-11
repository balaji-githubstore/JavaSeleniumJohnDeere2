package com.johndeere.print;

public class ArrayDemo {

	public static void main(String[] args) {
		// 10,20,30,40,50

		int[] numbers = new int[5]; // 5*32 bits of memory
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		System.out.println(numbers);
		System.out.println(numbers[3]);

		int[] arr = { 20, 50, 30 };
		System.out.println(arr);
		System.out.println(arr[2]);
		
		for(int val : arr)
		{
			System.out.println(val);
		}
		

		String[] colors = new String[3];
		colors[0] = "red";
		colors[1] = "green";

		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);

		String[] colors1 = { "green", "red", "yellow" };
		
		for(int i=0;i<3;i++)
		{
			System.out.println(colors1[i]);
		}
		
		
	}

}
