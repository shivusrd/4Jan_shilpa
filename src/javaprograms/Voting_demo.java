package javaprograms;

import java.util.Scanner;

public class Voting_demo

{
	public void geteligiblity(int age) 
	{
		
		if(age<18)
		{
			System.out.println("not Eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Voting_demo ob = new Voting_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = sc.nextInt();
		ob.geteligiblity(age);
	}
}
