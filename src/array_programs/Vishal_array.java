package array_programs;

import java.util.Scanner;

public class Vishal_array 
{
	public void bill( String a[],float b[],String name, long Mobilenumber )
	  {
		 Scanner sc = new Scanner(System.in);
		 float total = 0 ;
		    System.out.println("****VISHAL MEGA MART*****");
			System.out.println("customer name-" + name);
			System.out.println("mobile number-" + Mobilenumber);
			System.out.println("product name- ");
			for (int x=0;x<=a.length-1;x++)
			System.out.println("             "+a[x]);
			System.out.println("product amount is- ");
			for (int y=0;y<=b.length-1;y++)
			System.out.println("             "+b[y]);
			for (int z=0;z<=b.length-1;z++)
			   {
				total = total + b[z];
			   }
		 float gst = (total * 18) / 100;
		 float totalpay = total + gst;
			System.out.println("total payble amount- " + totalpay + " (including gst charges "+gst+")");
			System.out.println("***********");
       }

	public static void main(String[] args)
       {
            Vishal_array  ob = new Vishal_array ();
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter customer name");
			String name = sc.nextLine();
			System.out.println("please enter mobile number");
			long Mobilenumber = sc.nextLong();
			System.out.println("How many products did you purchased today");
			int size = sc.nextInt();
			String j[] = new String[size];
			float l[] = new float[size];
			System.out.println("please enter the products name");
			for (int i = 0; i <=size-1; i++)
            {
				 j[i] = sc.next();
            }
			System.out.println("Please enter the amount");
			for (int k = 0; k <=size-1; k++) 
			{
				l[k] = sc.nextFloat();
			}
			ob.bill(j, l, name, Mobilenumber);
	    }
}
