package com.week2labexercise.com;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 2.50f;
		float f2 = 4.50f;
		System.out.println("Before the number swap");
		System.out.println("The value of F1  "+f1);
		System.out.println("The value of F2  "+f2);
		
		
		float f3 = f1; 	//float f1 value assigned to f3 temporary
		f1=f2; 			//float f2 value assigned to f1
		f2=f3;			//value of f3 (which contain the initial value of f1 is assigned to f2		
		
		System.out.println("After the number swap");
		System.out.println("The value of F1  "+f1);
		System.out.println("The value of F2  "+f2);
		
	}

}
