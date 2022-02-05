package array_programs;

import java.util.Scanner;

public class Fibonacci_series
{
     public void getno(int num)
	{
		int a = 0;
		int b = 1;
		int c;
		for (int i=0;i<=num;i++)
          {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		  }
    }
     public static void main(String[] args) 
	{
		Fibonacci_series ob = new Fibonacci_series();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the range");
		int num = sc.nextInt();
		ob.getno(num);
	}

}
