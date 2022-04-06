package array_programs;

import java.util.Scanner;

public class Second_max

{
	public void getnumber() {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 5 input");
		for (int i = 0; i <= 4; i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		int secmax = 0;

		for (int j = 0; j <= 4; j++) 
		
		{
			if (a[j] > max) 
			{
				secmax = max;
				max = a[j];
			} 
			else if (a[j] > secmax)
			{
				secmax = a[j];
			}
		}
		System.out.println("your second highest input is-  " + secmax);

	}

	public static void main(String[] args)

	{
		Second_max ob = new Second_max();
		ob.getnumber();
	}

}