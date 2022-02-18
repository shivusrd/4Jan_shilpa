package theory;

import java.io.FileInputStream;

import java.util.Scanner;


public class Array_outofbound
{
		public void getvalidate() 
		{
			
			int a[]=new int[3];
			a[3]=30;
		}
		
		public static void main(String[] args) 
		{
			 Array_outofbound ob = new  Array_outofbound();
			
			ob.getvalidate();
		}
	}

