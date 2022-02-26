package collection_demo;

import java.util.Iterator;

import java.util.LinkedHashSet;

public class Linkedhashset_demo
{
	

	
		public static void Getdata()
		{
			LinkedHashSet<String>hs= new LinkedHashSet<String>();
			hs.add("ravi");
			hs.add("naveen");
			hs.add("vijay");
			hs.add("subham");
			hs.add("ravi");
			hs.add("subham");
			hs.add("rajeev");
			hs.add("Anshul");
			System.out.println(hs);
			Iterator<String> itr = hs.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				itr.remove();
			}
			System.out.println(hs);
//			for(String dd:hs)
//			{
//				System.out.println(dd);
//			}
//			
			
		}
		
		public static void main(String[] args)
		{
			Getdata();
		}
	}

