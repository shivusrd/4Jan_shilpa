package array_programs;

import java.util.Scanner;

public class Count_no
{
        public void getdigit(String input)
		{
			char[] c = input.toCharArray();
			int sum=0;
			for(int i=0;i<=c.length-1;i++)
			{
			   if(Character.isDigit(c[i]))
				{
				 String out = Character.toString(c[i]);
				 int num = Integer.parseInt(out);
	             sum=sum+num;
				}
			}
			System.out.println(sum);
		}

		public static void main(String[] args)
		{
			Count_no ob = new Count_no();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the String");
			String input = sc.next();
			ob.getdigit(input);
		}
	}