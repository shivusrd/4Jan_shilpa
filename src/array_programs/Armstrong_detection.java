package array_programs;

import java.util.Scanner;

public class Armstrong_detection
{
	public void getvalidate(int num)
	{
			int out = 0;
			int temp = num;
			int tempp = num;
			int length = 0;
		for (;num>0;)
          {  
			length++; 
			num = num/10;
		  }
        for (;temp>0;)
		  {
			 int a = temp % 10;
			 temp = temp / 10;
			 int sum = 1;
			 for (int k=1;k<=length;k++)
			  {
			  sum = sum*a ;
			  }
			  out = out + sum;
		  }
	 	if (tempp==out)
	 		{
	 			System.out.println(tempp+" is an armstrong no.");
	 		}
	 	else
	 		{
	 		   System.out.println(tempp+" is not an armstrong no.");
	 		}
     }

	      public static void main(String[] args)
	{
		Armstrong_detection ob = new Armstrong_detection ();
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter a number");
		int num = sc.nextInt();
		ob.getvalidate(num);
	}

}
