package javaprograms;

import java.util.Scanner;

public class Votingeligiblity
{
	
	public void geteligiblity(int age) 
	{
		
		if(age<18)
		{
			System.out.println("not Eligible for vote");
		}
		else if(age>=18&&age<=60)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("Retired!");
		}
	}
	
	
	public static void main(String[] args) {
	
		Votingeligiblity ob = new Votingeligiblity();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = sc.nextInt();
		ob.geteligiblity(age);
	}

}
