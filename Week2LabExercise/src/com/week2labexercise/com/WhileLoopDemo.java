package com.week2labexercise.com;
import java.util.*;
public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter any integer value below 10: ");
		int num = sc.nextInt();
		while (num<=10)
		{
			sum = sum+num;
			num++;
		}
			
		System.out.format("Sum of the numbers for while loop is %d ", sum);
	}

}
