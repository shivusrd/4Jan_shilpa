package array_programs;

import java.util.Scanner;

public class Occurance_demo 

{
	   public void getoccurance(String input)
	  {
			char[] c = input.toCharArray();
			for(int j=0;j<=c.length-1;j++)
			{
				int count=0;
				char data = c[j];
				for(int k=0;k<=c.length-1;k++)
				{
					if(c[k]==data)
					{
						count++;
					}
				}
				System.out.println(data+" = "+count);
			}
	   }
		public static void main(String[] args) 
		{
			Occurance_demo ob = new Occurance_demo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the String");
			String name = sc.nextLine();
			ob.getoccurance(name);
		}
	}
