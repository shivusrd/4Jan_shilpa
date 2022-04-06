package test_java;

import java.util.Scanner;

public class Reverse 

	{
	      public void getdata (String input) 
		   {   
	       String [] c =input.split(" ") ; 
		   for(int i=0;i<=c.length-1;i++) 
			{
				String out = c[i];
				
				char[] a = out.toCharArray();
                char temp = a[0];
			    a[0] = a[a.length - 1];
			    a[a.length - 1] = temp;
			
			
			System.out.println(String.valueOf(a));  
			  
			}  
	 }
		
		  public static void main(String[] args)
		  {
			Reverse ob= new Reverse() ;
			Scanner sc = new Scanner (System.in);
			System.out.println("please enter the sentence");
			String input =sc.nextLine();
			ob.getdata(input);
			
		  }	
		
	}


