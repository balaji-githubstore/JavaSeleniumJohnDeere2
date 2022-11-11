package com.johndeere.print;


public class HelloWorld {

	public static void main(String[] args) {
		
		
		System.out.println("hello1"); 
		System.out.print("hello2"); 
		System.out.println("hello3"); 
		System.out.print("hello4"); 
		System.out.print("hello5"); 
		
		
		byte a=80; //8 bit
		a=54;
		short b=80; //16 bit 
		int c=80; //32 bit 
		long d=8989988989L;//64 bit 
		
		float e=1.123456789f; //32 bit 
		double f=1.123456789; //64 bit 
		
		//int -->1000*32=32000 bits of memory 
		//byte -->1000*8=8000 bits of memory 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		char letter='8'; //16 bit of memory 
		boolean check=true;
		
		String name="Balaji"; //16*6 bits of memory
		
	}
}
