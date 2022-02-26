package collection_demo;

import java.util.ArrayList;

import java.util.Scanner;

public class Arraylist_demo
{

	public void getverify () 
    {
		Scanner sc = new Scanner(System.in);
	    
	  ArrayList <String>list1= new ArrayList <String> ();
      System.out.println("please enter your list 1");
		 for (int i=0;i<=4;i++)
			 { 
			    list1.add(sc.nextLine());
			 }
			 
	  ArrayList <String>list2= new ArrayList <String> ();
	  System.out.println("please enter your list 2");
		 for (int k=0;k<=4;k++)
			 { 
			   list2.add(sc.nextLine());
			 }
		 for(String tempList:list1)      
	     if (list2.contains(tempList))   
	     { System.out.println(tempList);}

    }
       
    public static void main(String[] args)
	{ 
    	Arraylist_demo ob = new Arraylist_demo();
		ob.getverify();
	}
}
