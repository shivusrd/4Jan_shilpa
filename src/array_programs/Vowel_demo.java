package array_programs;

import java.util.Scanner;

public class Vowel_demo

	{
		public void getdata()
		{
			char c[]=new char[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the char");
			for(int j=0;j<=4;j++)
			{
				 c[j] = sc.next().charAt(0);
			}
			
			for(int k=0;k<=4;k++)
			{
				char input=c[k];
			
				if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
				{
					System.out.println(input+" is a vowel");
				}
				else
				{
					System.out.println(input+" is a consonant");
				}
			}
	}		
		public static void main(String[] args)
		{
			Vowel_demo ob = new Vowel_demo();
			ob.getdata();
		}
	}