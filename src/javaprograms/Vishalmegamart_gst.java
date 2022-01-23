package javaprograms;

import java.util.Scanner;

public class Vishalmegamart_gst

{
	float total;

	public void bill(float amount, String name, long Mobilenumber, String productname) {
		float gsta = (amount * 5) / 100;
		float gstb = (amount * 10) / 100;
		float gstc = (amount * 18) / 100;
		System.out.println("****VISHAL MEGA MART*****");
		System.out.println("customer name-" + name);
		System.out.println("mobile number-"+ Mobilenumber);
		System.out.println("product name-"+ productname);
		System.out.println("product amount is-"+ amount);

		if (amount < 1000) 
		{
		total = gsta + amount;
		System.out.println("total payble amount- "+total+" (including gst charges 5 % )"+gsta);
		}

		else if (amount >= 1000 && amount <= 2000) 
		{
		total = gstb + amount;
		System.out.println("total payble amount- "+total+" (including gst charges 10 %)"+gstb);
		}

		else if (amount > 2000) 
		{
		total = gstc + amount;
		System.out.println("total payble amount- "+total+" (including gst charges 18 %)"+gstc);
		}
		System.out.println("***********");

	}

	public static void main(String[] args)

	{

		Vishalmegamart_gst ob = new Vishalmegamart_gst();
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
