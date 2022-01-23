package javaprograms;

import java.util.Scanner;

public class Demo

{
	
	float c;
	public void calci(String type,float a, float b) 
	{
		if(type.equalsIgnoreCase("Add"))
		{
			c = a+b;
					System.out.println("Addation is = "+c);
		}
		else if(type.equalsIgnoreCase("minus"))
		{
			c = a-b;
					System.out.println("Subtraction is = "+c);
		}
		else if(type.equalsIgnoreCase("multiply"))
		{
			c = a*b;
					System.out.println("Multiplication is = "+c);
		}
		else if(type.equalsIgnoreCase("divide"))
		{
			c = a/b;
					System.out.println("Division is = "+c);
		}
		else {
			System.out.println("Kindly press corret value");
		}
	}
	
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert first number");
		float n1 = sc.nextFloat();
		System.out.println("Insert first number");
		float n2 = sc.nextFloat();
		System.out.println("Please Enter Add or Minus or Multiply or Divide ");
		String type = sc.next();
		
		Demo ob = new Demo();
		ob.calci(type,n1, n2);
		sc.close();
	}

}
