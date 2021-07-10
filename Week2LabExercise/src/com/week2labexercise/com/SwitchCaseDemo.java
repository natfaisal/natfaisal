package com.week2labexercise.com;
import java.util.*;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi There.. Welcome to the days finding program...");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter any number between 1 to 7 .. 1 refers to Monday and 7 refers to Sunday");
		int a = sc.nextInt();
		switch(a) {
		case 1:
		{
			System.out.println("The entered number by you is " +a+ " It is Monday");
			break;
		}
		case 2:
		{
			System.out.println("The entered number by you is " +a+ " It is Tuesday");
			break;
		}
		
		case 3:
		{
			System.out.println("The entered number by you is " +a+ " It is Wednessday");
			break;
		}
		
		case 4:
		{
			System.out.println("The entered number by you is " +a+ " It is Thursday");
			break;
		}
		
		case 5:
		{
			System.out.println("The entered number by you is " +a+ " It is Friday");
			break;
		}
		
		case 6:
		{
			System.out.println("The entered number by you is " +a+ " It is Saturday");
			break;
		}
		
		case 7:
		
		{
			System.out.println("The entered number by you is " +a+ " It is Sunday");
			break;
		}
		
		
		}
	}

}
