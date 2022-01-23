package array_programs;

import java.util.Scanner;

public class Name 

{
	 public void name (String name)
	 {
		for (int a=1;a<=10;a++) 
		{
		System.out.println(name+a);	
		}
	  
    }
	public static void main(String[] args)
	
   {
	 Name ob = new Name();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("please enter a name");
	 String name = sc.nextLine();
	 ob.name(name);
	 sc.close();
	  
	  
	}
}
