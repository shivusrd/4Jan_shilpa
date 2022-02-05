package array_programs;

import java.util.Scanner;

public class Pallindrome_int
{ 
	 public void validatepalindrome (int num) 
	 {
		 int x=num;
		 int a=0;
			for(;num>0;)
			{
				int b=num%10;
				num=num/10;
				a=a*10+b;
			}
			if(x==a)
			{
				System.out.println(x+" is a numeric Palindrome ");
			}
			else {
				System.out.println(x+" is not a numeric palindrome");
			} 
	 }
	 public static void main(String[] args)
	 {
		 Pallindrome_int ob = new Pallindrome_int ();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("please enter a number");
		 int num=sc.nextInt();
		 ob.validatepalindrome(num);
	 }

}