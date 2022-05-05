package array_programs;
import java.util.Scanner;

public class Reverse_sentence
{
      public void getdata (String input) 
	  {   
      
       String [] c =input.split(" ") ;
	   String out = ""; 
	   for(int i=0;i<=c.length-1;i++) 
		{
			String out1 = c[i];
			
			char[] a=out1.toCharArray();
			for(int k=a.length-1;k>=0;k--) 
			{
				out=out+a[k];
			}
			out=out+" ";
		}
		System.out.println(out);  
		  
		  
 }
	
	  public static void main(String[] args)
	  {
		Reverse_sentence ob= new Reverse_sentence() ;
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter the sentence");
		String input =sc.nextLine();
		ob.getdata(input);
		
	  }	
	
}
