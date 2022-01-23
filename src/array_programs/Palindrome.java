package array_programs;

import java.util.Scanner;

public class Palindrome

{
	public void getname(String input)
	{
		String out ="";
		char a[] = input.toCharArray();
	    int size=a.length-1;
		for(int i=size;i>=0;i--)
		{
		out = out + a[i];
		}
		System.out.println(out);

		if (input.equalsIgnoreCase(out))
		{
		System.out.println(input+" is a palindrome");
		} 
		else
		{
		System.out.println(input+" is not a palindrome");
		}
    }
    public static void main(String[] args)
      {

		Palindrome ob = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a name");
		String input=sc.next();
		ob.getname(input);
       }
}