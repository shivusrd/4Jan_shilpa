package excel_utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class voting_utility 

{
	public static String matchdata(String path,int colnum,int rownum)
    {
	   String value = "";
	   try 
	   {
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sheet = wb.getSheetAt(0);
	    value=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	   }
	   catch (Exception e) 
	   {
		System.out.println("issue in readdata"+e);
	   }
	return value;
    }  
	 public static void  getdata () 
	{
	    Scanner sc = new Scanner (System.in);
		{System.out.println("please enter your name");
	    String name = sc.nextLine();
		System.out.println("please enter your mobile number");
		long no = sc.nextLong();
		System.out.println("please enter your age");
	    int age = sc.nextInt();
		  if (age<18) 
		  {
			System.out.println("sorry you are not eligible");
			getdata();
		  }
		  else 
		  {  
	        System.out.println("Please enter the choice");
		    System.out.println("press 1 for adhaar\npress 2 for voter id");
	     	int choice = sc.nextInt();
	     	if ( choice==1 )
	        {
	     	  System.out.println("please enter your adhaar number"); 
	     	  String adhaar = sc.next();
	     	  String path = "C:\\Users\\dubey\\eclipse-workspace\\4_january_batch\\testdata\\testdata.xlsx";
			  int vote =0;
           for (int i=0; i<=13; i++) 
		    {
			 String out = matchdata(path, 0, i);
		   if (adhaar.equals(out)) 
		    {	
			 System.out.println("your record is found in db");
			 vote=1;
			 System.out.println(
			"press 1 to vote BJP\npress 2 to vote for Congress\npress 3 to vote for AAP\npress 4 to vote for nota");
		    
			 int votechoice = sc.nextInt();
			 if (votechoice == 1) 
				{
				 System.out.println("your vote is submited for BJP");
				 } 
			 else if (votechoice == 2) 
				 {
				  System.out.println("your vote is submited for congress");
				 } 
			 else if (votechoice == 3)
			     {
				  System.out.println("your vote is submited for AAP");
				 } 
			 else if (votechoice == 4)
				 {
				   System.out.println("your vote is submited for nota");
				  } 
			  System.out.println("Voter name - " + name);
			  System.out.println("mobile number - "+no);
              System.out.println("age - " + age);
              System.out.println("adhaar number - " + adhaar);
              System.out.println("Your vote is successfully submited");
		     }			
		    }
           if (vote == 0) 
			{
				System.out.println("your adhaar number not match in records");
			
			}
        }
		  else	if (choice==2) 
	    {
	     	   System.out.println("please enter your voter id number"); 
	     	   String voterid = sc.next();
	    String path = "C:\\Users\\dubey\\eclipse-workspace\\4_january_batch\\testdata\\testdata.xlsx"; 	   
		int vote=0;
	    for (int i=0; i<=13; i++) 
		{
		  String out1 = matchdata(path, 1, i);
		if (voterid.equals(out1)) 
		  {
		    System.out.println("your record found in db");
			vote = 1;
			System.out.println(
			"press 1 to vote BJP\npress 2 to vote for Congress\npress 3 to vote for AAP\npress 4 to vote for others");
			int choicevote = sc.nextInt();
			if (choicevote == 1) 
			{
			  System.out.println("your vote is submited for BJP");
			 } 
			else if (choicevote == 2) 
			{
			  System.out.println("your vote is submited for congress");
			} 
			else if (choicevote == 3)
            {
			  System.out.println("your vote is submited for AAP");
			} 
			else if (choicevote == 4)
			{
			  System.out.println("your vote is submited for other");
			} 
			System.out.println("Voter name is - " +name);
			System.out.println("mobile number- "+no);
            System.out.println("age- " + age);
            System.out.println("Voter id number - " + voterid);
            System.out.println("Your vote is successfully submited");}
    }
	    if (vote == 0) 
		{
			System.out.println("your voter id not matched in records");

		}
	}}}}	

	   public static void main(String[] args) 
	{
		String path ="C:\\Users\\dubey\\eclipse-workspace\\4_january_batch\\testdata\\testdata.xlsx";
		matchdata(path, 0, 0);	
		getdata();
		
     }

}
