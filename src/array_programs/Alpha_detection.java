package array_programs;

import java.util.Scanner;

public class Alpha_detection
{
 
	public void getname (String input,char c) 
   {
		char[] a=input.toCharArray();
		String out="";
		for(int i=0;i<=a.length-1;i++)
		{
		out = out + a[i];
		if  (a[i]==c)
		{
        	
		}
		
		}	
		
   }
	
	public static void main(String[] args)
	{
		
	Alpha_detection ob=new Alpha_detection ();	
	Scanner sc=new Scanner (System.in);	
	System.out.println("please enter a name");
	String input = sc.nextLine();
	System.out.println("please enter an alphabet");
	char c = sc.next().charAt(0);
	ob.getname(input,c);
	}	
	
	
}