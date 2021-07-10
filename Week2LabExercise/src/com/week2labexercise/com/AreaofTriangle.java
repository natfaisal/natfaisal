package com.week2labexercise.com;
import java.util.*;
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi There.. Welcome to the program of Area of Triangle");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the value of width");
		double a = sc.nextDouble();
		System.out.println("Please enter the value of height");
		double b = sc.nextDouble();
		double area = (a*b)/2;
		System.out.println("Area of triangle on the value entered by you is... " + area);
	}

}
