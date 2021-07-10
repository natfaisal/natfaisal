package com.week2labexercise.com;
import java.util.Scanner;
public class OddOrEvenProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi There.. Welcome to find out entered number is even or odd");
		Scanner sc =  new Scanner(System.in);
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
