package array_programs;
import java.util.Scanner;

public class Number_range
{
	
	public void getno () 
{
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		for(int p=0;p<=4;p++)
		{
		 a[p] = sc.nextInt();
		}
			
		for(int k=0;k<=4;k++)
		{
			int input=a[k];	
		
		  if ( input>=0&&input<=20)
			 {
			 System.out.println(input+" is between 0 to 20");
			 }
			 else if ( input>20&&input<=50)
			 {
			 System.out.println(input+" is between 20 to 50");
			 }
			 else if ( input>50&&input<=100)
			 {
		     System.out.println(input+" is between 50 to 100");
			 }
			 else 
			 {
			 System.out.println(input+" is above 100");
			 }				
	}			
}		
		public static void main(String[] args) 
	{
		
		Number_range ob = new Number_range ();
		ob.getno();
	}

}