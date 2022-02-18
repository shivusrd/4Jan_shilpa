package theory;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Exception_handlingdemo 
	{
		public void a()
		{
			System.out.println("Hello a method");
		}
		public void b()
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the two no");
				int a = sc.nextInt();
				int b= sc.nextInt();
				int c=a/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("Issue in b method "+e);
				
			}
			
			finally
			{
				System.out.println("Hello finally block");
			}
		}
		public void c()
		{
			System.out.println("Hello c method");
		}
		
		public static void main(String[] args) 
		{
			Exception_handlingdemo ob = new Exception_handlingdemo();
			ob.a();
			ob.b();
			ob.c();
		}
	}

