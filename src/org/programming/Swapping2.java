package org.programming;

public class Swapping2 {
	
public static void main(String[] args) {
		
		int a=53, b=28;
		System.out.println("Before Swap a : "+a);
		System.out.println("Before Swap b : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap a : "+a);
		System.out.println("After Swap b : "+b);
		

	}

}
