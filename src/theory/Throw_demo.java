package theory;

import java.util.Scanner;

public class Throw_demo 
	{

		public void getvalidate(int age)
		{
			try {
				if(age<18)
				{
					throw new Exception("not eligible");
				}
				else
				{
					System.out.println("Eligible ");
				}
			} catch (Exception e)
			{
				System.out.println("issue in getvalidate "+e);
				main(null);
			}
		}
		
		public static void main(String[] args)
		{
			Throw_demo ob = new Throw_demo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the age");
			int age = sc.nextInt();
			ob.getvalidate(age);
		}
	}

