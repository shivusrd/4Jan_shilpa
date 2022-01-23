package javaprograms;

import java.util.Scanner;

public class Marksheet 
{
	public void details(String name,String fathersname,String collegename,int rollno,float hindi,
	             float math,float science,float english,float computer,float totalmarks,float percent)

	{
		totalmarks = hindi + math + science + english + computer;
		percent = (totalmarks * 100) / 500;
		System.out.println("MARKSHEET \n");
		System.out.println("student name- "+name);
		System.out.println("father's name- "+fathersname);
		System.out.println("college name- "+collegename);
		System.out.println("roll no.- "+rollno);
		System.out.println("hindi- "+hindi);
		System.out.println("math- "+math);
		System.out.println("science- "+science);
        System.out.println("english- "+english);
        System.out.println("computer- "+computer);
        System.out.println("total marks- "+totalmarks);
        System.out.println("percentage- "+percent+" %");

	}

	public static void main(String[] args) 
	{

		Marksheet ob = new Marksheet();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter student name");
		String name = sc.nextLine();
		System.out.println("please enter father's name");
		String fathersname = sc.nextLine();
		System.out.println("please enter college name");
		String collegename = sc.nextLine();
		System.out.println("please enter roll number");
		int rollno = sc.nextInt();
		System.out.println("please enter marks in hindi ");
		float hindi = sc.nextInt();
		System.out.println("please enter marks in math ");
		float math = sc.nextInt();
		System.out.println("please enter marks in science");
		float science = sc.nextInt();
		System.out.println("please enter marks in english");
		float english = sc.nextInt();
		System.out.println("please enter marks in computer");
		float computer = sc.nextInt();
		ob.details(name,fathersname,collegename,rollno,hindi,math,science,english,computer,english, computer);
	}

}
