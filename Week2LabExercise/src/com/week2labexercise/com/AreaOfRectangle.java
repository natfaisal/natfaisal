package com.week2labexercise.com;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi There.. Welcome to the program of Area of Rectangle");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the value of length");
		double a = sc.nextDouble();
		System.out.println("Please enter the value of width");
		double b = sc.nextDouble();
		double rec = a*b;
		System.out.println("Area of rectangle on the value entered by you is... " + rec);
	}

}
