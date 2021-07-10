package com.week2labexercise.com;
import java.util.*;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi There.. Welcome to find which is big number out of 3 numbers you entered");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter 3 numbers one by one");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		if (a>b && a>c) {
			System.out.println("The number " +a+ " enterd by you is greater than others");
		}
		else if (b>a && b>c)
		{
			System.out.println("The number " +b+ " enterd by you is greater than others");
		}
					
		else if (a==b && b==c)
		{
			System.out.println("The number " +c+ " enterd by you is qual with others");
		}
		else
		{
			System.out.println("The number " +c+ " enterd by you is greater than others");
		}
	}

}
