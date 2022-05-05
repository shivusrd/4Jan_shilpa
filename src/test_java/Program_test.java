package test_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ArrayStack;

public class Program_test
{
	 
	
	
	public static void main(String[] args) 
	{
		
		//My name is Aparna
		String input ="MynameisAparna";
		String s[]=input.split(" ") ;
		String out = "";
		for (int i=0; i<=s.length-1 ; i++) 
		{
			
			String out1 = s[i];
			char []c = out1.toCharArray();
			for (int k=c.length-1; k>=0 ; k--) 
			{
				out = out +c[k];
				
			}
			out = out + " ";
			System.out.println(out);
			
	   }
		
		
	}
  }
