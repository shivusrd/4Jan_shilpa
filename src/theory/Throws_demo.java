package theory;

import java.util.Scanner;

	public class Throws_demo 
	{

		public void getvalidate(int age) throws InterruptedException,ArithmeticException
		{
			System.out.println("hello start method");
			Thread.sleep(3000);
			System.out.println("Hello end method");
			
		}
		
		public static void main(String[] args)
		{
			Throw_demo ob = new Throw_demo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the age");
			int age = sc.nextInt();
			ob.getvalidate(age);
		}
}
