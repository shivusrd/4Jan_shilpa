package javaprograms;

import java.util.Scanner;

public class Vishalmegamart_demo

{
	public void bill(float amount, String name, long Mobilenumber, String productname) {

		float gst = (amount * 18) / 100;
		float totalamount = amount + gst;

		System.out.println("****VISHAL MEGA MART*****");
		System.out.println("customer name-" + name);
		System.out.println("mobile number-" + Mobilenumber);
		System.out.println("product name-" + productname);
		System.out.println("product amount is-"+ amount);
		System.out.println("total payble amount- " + totalamount + " (including gst charges "+gst+")");
		System.out.println("***********");

	}

	public static void main(String[] args)

	{

		Vishalmegamart_demo ob = new Vishalmegamart_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter customer name");
		String name = sc.nextLine();
		System.out.println("please enter mobile number");
		long Mobilenumber = sc.nextLong();
		System.out.println("please enter product name");
		String productname = sc.next();
		System.out.println("product amount");
		float amount = sc.nextFloat();
		ob.bill(amount, name, Mobilenumber, productname);
		
	}

}