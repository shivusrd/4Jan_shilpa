package javaprograms;

import java.util.Scanner;

public class Switch_demo 
{

	public void getvalidatechar(char input)
		{
			
		switch(input)
			{
			case 'a':
			{
			System.out.println(input+" is a vowel");
			break;
			}
			case 'e':
			{
			System.out.println(input+" is a vowel");
			break;
			}
			case 'i':
			{
			System.out.println(input+" is a vowel");
			break;
			}
			case 'o':
			{
			System.out.println(input+" is a vowel");
			break;
			}
			case 'u':
			{
			System.out.println(input+" is a vowel");
			break;
			}
			default:
			{
			System.out.println(input+" is consonat");
			}
				}
			
		}
		
		public static void main(String[] args)
		{
			Switch_demo ob = new Switch_demo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Plase enter the input");
			char input = sc.next().charAt(0);
			ob.getvalidatechar(input);
		}
		
	}
