package javaprograms;

import java.util.Scanner;

public class Calci_scanner 
{
	int a,b,c;
	Scanner sc = new Scanner (System.in);
			 
	public void addition ()
	
	{
		System.out.println(" please enter two input ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println(c);
	}
	
	public void subtraction ()
	
	{
		System.out.println(" please enter two input ");
		a = sc.nextInt();
		b = sc.nextInt(); 
		c = a-b;
		System.out.println(c);
	}
	
	public void division ()
	
	{
		System.out.println(" please enter two input ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a/b;
		System.out.println(c);
	}
	
	
	public void multiplication ()
	
	{
		System.out.println(" please enter two input ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a*b;
		System.out.println(c);
		
	}

	public static void main(String[] args)
	
	{
		Calci_scanner ob = new Calci_scanner ();
		ob.addition();
		ob.subtraction();
		ob.division();
		ob.multiplication();
	}

}
