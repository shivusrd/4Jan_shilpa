package array_programs;

import java.util.Scanner;

public class Table 
{
    public void number (int number) 
  {
    	for (int i=1;i<=10;i++)
    	{
    	System.out.println(number+"*"+i+"="+number*i);
    	}
   
  }
    public static void main(String[] args) 
   
   {
    Table ob = new Table();	
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter a number");
    int number =sc.nextInt();
    ob.number(number);	
   }             
	 	
}
