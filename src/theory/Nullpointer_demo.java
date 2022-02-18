package theory;

import java.io.FileInputStream;

import java.util.Scanner;

public class Nullpointer_demo
{
	
	
		public void getvalidate() 
		{
			String s=null;
			System.out.println(s.length());
		}
		
		public static void main(String[] args) 
		{
			Nullpointer_demo ob = new Nullpointer_demo();
			
			ob.getvalidate();
		}
	}

