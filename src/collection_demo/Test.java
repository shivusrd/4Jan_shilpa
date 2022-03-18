package collection_demo;

import java.util.Scanner;

public class Test 
{

	public void getdata ( float marks )
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter your marks");
	    marks = sc.nextFloat();
		if (marks<=33)
		{
		 float total=marks+5;	
		 System.out.println(total);
		}
	    if (marks>33 && marks<=50)
		{
		 float total1=marks*5;
		 System.out.println(total1);
	    }
		if (marks>50)
		{
		 float c=marks%10;
	       if (c%2==0)
	       {
	    	  float total2=marks*2;
	    	   System.out.println(total2);
	       }
	       else 
	       {System.out.println(marks);}
		}
		
	}
	
	public static void main(String[] args) 
	
	{
		Test ob = new Test ();
	    ob.getdata(0);
	}
}
