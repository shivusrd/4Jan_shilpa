package javaprograms;

import java.util.Scanner;

public class Calculator_choice 

{
	float add, div, multi, sub;
	public void choice (float inputa,float inputb,int a)
  {
	    if (a==1)
	    {
			add = inputa + inputb ;
			System.out.println(add);
		}
		else if (a==2)
		{
			div = inputa / inputb ;
			System.out.println(div);
		}
		else if (a==3)
		{
			sub = inputa - inputb ;
			System.out.println(sub);
		}
		else if (a==4)
		{
			 multi = inputa * inputb ;
			 System.out.println(multi);
		}
		
  }
	
	public static void main(String[] args)
	
  { 
	    Scanner sc = new Scanner(System.in);	
		System.out.println("please enter first number");
		float inputa = sc.nextFloat();
		System.out.println("please enter second number");
		float inputb = sc.nextFloat();
		System.out.println("press 1 for addition");
		System.out.println("press 2 for division");
		System.out.println("press 3 for subtraction");
		System.out.println("press 4 for multiplication");
		int a =sc.nextInt();
		
//	float add = sc.nextFloat();
//	float div = sc.nextFloat();
//	float sub = sc.nextFloat();
//   float multi = sc.nextFloat();
	Calculator_choice ob = new Calculator_choice () ;	
	ob.choice(inputa, inputb, a);
		
	}
}