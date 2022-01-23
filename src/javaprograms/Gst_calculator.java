package javaprograms;

import java.util.Scanner;

public class Gst_calculator

{
	public void getgst (float amount) 
	{
		float gst = (amount*18)/100;
		System.out.println(gst);
	}
	
	public static void main(String[] args) 
	
	{
	Gst_calculator ob = new Gst_calculator() ;
	Scanner sc = new Scanner (System.in);
	System.out.println("please enter the amount");
	float input = sc.nextFloat();
	ob.getgst(input);
	}

}
