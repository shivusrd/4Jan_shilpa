package array_programs;

import java.util.Scanner;

public class String_detection 
{
	public void getdata(String input, String input2) 
	{
		String[] a = input.split(" ");
		String out = "";
        int count=0;
		for (int i=0;i<=a.length-1;i++) 
		{
		  String out1 = a[i];
          if (out1.equals(input2)) 
		  {
		   char[] c = a[i].toCharArray();
		   for (int k = c.length - 1; k >= 0; k--)
		   {out = out + c[k];
           count++;}
		  }
		}
		  if (count>=1)
		  { 
			 System.out.println(out);
		  }
          else 
	      {
             System.out.println(input2+" is not exist in your sentence");
          }
    }  
		 public static void main(String[] args)

	{
		String_detection ob = new String_detection();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the sentence");
		String input = sc.nextLine();
		System.out.println("please enter a word");
		String input2 = sc.nextLine();
		ob.getdata(input, input2);
	}
}