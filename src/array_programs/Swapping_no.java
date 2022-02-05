package array_programs;

import java.util.Scanner;

public class Swapping_no 
{
     public void swap(int A, int B) 
     {
    	A=A+B;
    	B=A-B;
    	A=A-B;
    	System.out.println("A="+A+" B="+B);
 
     }
	 public static void main(String[] args) 
	 {
	   Swapping_no ob = new Swapping_no();
	   Scanner sc = new Scanner (System.in);
	   System.out.println("please enter first no. (A)");
	   int A = sc.nextInt();
	  System.out.println("please enter second no. (B)");
	   int B = sc.nextInt();
	   ob.swap(A,B);
     }
}