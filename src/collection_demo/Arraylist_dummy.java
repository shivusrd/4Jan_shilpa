package collection_demo;

import java.util.ArrayList;

public class Arraylist_dummy 
{
	
		public static void main(String[] args) {
			
			ArrayList<Integer>li= new ArrayList<Integer>();
			li.add(123);
			li.add(3222);
			li.add(444);
			li.add(333);
			
			for(int i=0;i<=li.size()-1;i++)
			{
				System.out.println(li.get(i));
			}
//			for(Integer dd:li)
//			{
//				System.out.println(dd);
//			}
		}
	}

