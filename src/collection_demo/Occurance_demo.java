package collection_demo;

import java.util.LinkedHashSet;

public class Occurance_demo 
{
	public static void getdata(String input)
		{
			char[] c = input.toCharArray();
			LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
			for(int i=0;i<=c.length-1;i++)
			{
				hs.add(c[i]);	
			}
			for(Character dd:hs)
			{
				int count=0;
				for(char dd1:c)
				{
					if(dd==dd1)
					{
						count++;
					}
				}
				System.out.println(dd+" = "+count);
			}
			
		}
		
		
		public static void main(String[] args)
		{
			getdata("ajaysinghrathore");
		}
	}

