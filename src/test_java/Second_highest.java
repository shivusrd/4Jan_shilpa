package test_java;

import java.util.Scanner;

public class Second_highest 
{
  public void getsecondhigh(int a[])
  {
	  
		    int max=0;
			int second_max=0;
			for(int j=0; j<=a.length-1;j++)
			{
			   if(a[j] > max )
				{
					second_max=max;
					max=a[j];
				}
			    else if (a[j] > second_max)
				{
					second_max = a[j];
				}	
			}
			
			System.out.println("second highest num is-  "+second_max);
			
	  
  }  
	  public static void main(String[] args)
		{
		  int a[]= new int[5];
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the numbers");
			 
			 for(int i=0;i<=4;i++)
			 {
				 a[i]= sc.nextInt();
			 }
		     Second_highest  ob= new  Second_highest();
			 ob.getsecondhigh(a);
			
  }
}
