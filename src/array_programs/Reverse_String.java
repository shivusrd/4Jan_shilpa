package array_programs;

import java.util.Scanner;

public class Reverse_String 

	{
		public void getrevrese(String input)
		{
			String out="";
			char[] c=input.toCharArray();
			int size=c.length-1;
			for(int i=size;i>=0;i--)
			{
				out=out+c[i];
			}
			System.out.println(out)
	;
		}
		public static void main(String[] args) 
		{
			Reverse_String ob = new Reverse_String();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the input");
			String input=sc.next();
			ob.getrevrese(input);
		}
	}