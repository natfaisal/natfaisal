package com.week2labexercise.com;
import java.util.*;
public class NestedSwitchProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi There.. Welcome to the course selection program.....");
		System.out.println("Please enter 1 for technical course and 2 for non technical course ");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
		{
			System.out.println("You have opt for technical courses which is given below");
			System.out.println(" Java \n Paython \n Data Scientist \n Oracle \n MySql \n Machine Learning");
			break;
			
		}
				
		case 2: 
			System.out.println("You have opt for non technical courses. Please enter 1 to 3 to list out non technical subjects");
			int b = sc.nextInt();
			switch(b) 
			{
		
				case 1:
					System.out.println("Your Choice is - B.sc Mathametics");
					break;
				case 2:
					System.out.println("Your Choice is - B.sc Science");
					break;
				case 3:	
					System.out.println("Your Choice is - B.sc Urdu Lit");
					break;
			
			}
		}
		
	}

}
