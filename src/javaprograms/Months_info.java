package javaprograms;

import java.util.Scanner;

public class Months_info
{

		public void month (String monthname)
	{
		switch(monthname)
		{ 
		case "january" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
		case "february" :
		{	System.out.println( monthname +" have 28/29 days");
		 break;
		}
		case "march" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
		case "april" :
		{	System.out.println( monthname +" have 30 days");
		 break;
		}case "may" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
		case "june" :
		{	System.out.println( monthname +" have 30 days");
		 break;
		}
		case "july" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
		case "august" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
		case "september" :
		{	System.out.println( monthname +" have 30 days");
		 break;
		}
		case "october" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
		case "november" :
		{	System.out.println( monthname +" have 30 days");
		 break;
		}
		case "december" :
		{	System.out.println( monthname +" have 31 days");
		 break;
		}
			
			}	
			
		}
		
		public static void main(String[] args) 
	{
	    Months_info ob	= new  Months_info() ;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a month name");
		String monthname = sc.next();
		ob.month(monthname);
		
		}	
}
