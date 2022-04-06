package test_java;

import java.util.Scanner;

public class Info

{
   public  void getdata() 
   {
     Scanner sc= new Scanner (System.in);
     System.out.println("please enter your name");
     String name = sc.nextLine();
     System.out.println("please enter your birth place");
     String place = sc.next();
     
     System.out.println("***********your horoscope**********");
     System.out.println("name - "+name+"\n"+"birth place - "+place );
     
     if (name.startsWith("a"))
     {
     System.out.println("As per astrology, the name starts with 'A' falls in Kritika Nakshatra"
     +"\n"+"whose ruling lord is Sun and having Aries as its zodiac sign whose ruling lord is mars");
     }
     else if (name.startsWith("s"))	
     {
     System.out.println("As per astrology, the name starts with 'S' falls under Shatabhisha Nakshatra"
     +"\n"+"whose ruling lord is Rahu and having Aquarius as its zodiac sign whose ruling lord is Saturn. In this pretext,");
     }
 
   }
  
   public static void main(String[] args)
	{
		Info ob = new Info ();
		ob.getdata();
		
	}
}
