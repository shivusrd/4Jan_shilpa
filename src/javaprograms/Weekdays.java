package javaprograms;

import java.util.Scanner;

public class Weekdays
{
	
	public void week(String dayname)
{
		if (dayname.equals("sunday") )
		{	
			System.out.println(" sunday is 1st day of the week");
		}	
		else if (dayname.equals("monday") )
		{	
			System.out.println("monday is 2nd day of the week");	
		}	
		else if (dayname.equals("tuesday") )
		{	
			System.out.println("tuesday is 3rd day of the week");	
		}	
		else if (dayname.equals("wednesday") )
		{	
			System.out.println("wednesday is 4th day of the week");	
		}	
		else if (dayname.equals("thursday") )
		{	
			System.out.println("thursday is 5th day of the week");	
		}
		else if (dayname.equals("friday") )
		{	
			System.out.println("friday is 6th day of the week");	
		}	
		else if  (dayname.equals("saturday") )
		{	
			System.out.println("saturday is 7th day of the week");	
	}	
}
	
	public static void main(String[] args) 
{
	Weekdays ob	= new Weekdays() ;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a day name of a week ");
	String dayname = sc.next();
	ob.week(dayname);
	
	}	
	
}
