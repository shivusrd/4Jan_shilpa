package array_programs;

import java.util.Scanner;

public class Array_demo 
{

	public void getdata()
	{
		int[] a=new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=4;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}
	
	public static void main(String[] args)
	{
		Array_demo ob = new Array_demo();
		ob.getdata();
	}
}