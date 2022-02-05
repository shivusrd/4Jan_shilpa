package array_programs;

import java.util.Scanner;

public class Prime_no 

{
   public void getvalidate() 
   {  
	   int a[]= new int [5]; 
	 Scanner sc = new Scanner(System.in);
     System.out.println("please enter 5 numbers");
	   for (int i=0;i<=4;i++) 
	   {
			 a[i]=sc.nextInt();
	     if(a[i]==0||a[i]==1)
		  {
			System.out.println(a[i]+" is a prime no.");
		  }
	   else
		  {
			int b=0;
	    for(int k=2;k<a[i];k++)
	   {
		  if(a[i]%k==0)
		  {
		    b=1;
			System.out.println(a[i]+" is not a prime no.");
			break;
		   }
		}
			if(b==0)
			{
				System.out.println(a[i]+" is a prime no.");
			}
		}
	  }
 }
	   
     public static void main(String[] args)
	
	{
		Prime_no ob = new Prime_no() ;	
		ob.getvalidate();
	}
}
