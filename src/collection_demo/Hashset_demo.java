package collection_demo;

import java.util.HashSet;

public class Hashset_demo
{
	public static void Getdata()
		{
			HashSet<String>hs= new HashSet<String>();
			hs.add("ravi");
			hs.add("naveen");
			hs.add("vijay");
			hs.add("subham");
			hs.add("ravi");
			hs.add("subham");
			hs.add("rajeev");
			hs.add("Anshul");
			
			for(String dd:hs)
			{
				System.out.println(dd);
				
			}
			
			
		}
		
		public static void main(String[] args)
		{
			Getdata();
		}
	}

