package com.week2labexercise.com;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi There.. Welcome to the calculator of quotient & reminder of 2 numbers");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the first number");
		int a = sc.nextInt();
		System.out.println("Please enter the second number");
		int b = sc.nextInt();
		int quotient = a/b;
		System.out.println("Please find the result of quotient entered 2 numbers  " + quotient);
		int reminder = a%b;
		System.out.println("Please find the result of reminder entered 2 numbers  " + reminder);
		
		
		System.out.println("Hi There.. Welcome to find out entered number is even or odd");
		int val = sc.nextInt();
		if (val%2==0)
		{
			System.out.println("The entered number by you is even");
		}else
		{
			System.out.println("The entered number by you is odd");
		}
	}

}
