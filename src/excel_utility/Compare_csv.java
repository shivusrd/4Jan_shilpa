package excel_utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Compare_csv 
{
   public static  void main(String[] args) throws IOException 
   {
	   String path="C:\\Users\\dubey\\eclipse-workspace\\Java\\";
	   String file1="doc.csv";
	   String file2="doc1.csv";
	   ArrayList al1=new ArrayList();
	   ArrayList al2=new ArrayList();
	    
	   
	    BufferedReader readFile1 = new BufferedReader(new FileReader(path+file1));
	    String dataRow1 = readFile1.readLine();
	    while (dataRow1 != null)
	    {
	        String[] dataArray1 = dataRow1.split(",");
	        for (String item1:dataArray1)
	        { 
	           al1.add(item1);
	        }
	       
	        dataRow1 = readFile1.readLine(); 
	    }
	    System.out.println(al1);
        readFile1.close();

	    BufferedReader readFile2 = new BufferedReader(new FileReader(path+file2));
	    String dataRow2 = readFile2.readLine();
	    while (dataRow2 != null)
	    {
	        String[] dataArray2 = dataRow2.split(",");
	        for (String item2:dataArray2)
	        { 
	           al2.add(item2);

	        }
	        dataRow2 = readFile2.readLine(); 
	    }
	    System.out.println(al2);
	    readFile2.close();
	     
	for (int i=0; i<=al1.size()-1; i++)   
	 
	 {
		 if (al1.equals(al2)) 
	   {
		  System.out.println("true");
	   }
	  
	 }   

//	     for(String bs:al2)
//	     {
//	         al1.remove(bs);
//	     }
//
//	     int size=al1.size();
//	     System.out.println(size);
//
//	     try
//	        {
//	            FileWriter writer=new FileWriter(path+file3);
//	            while(size!=0)
//	            {
//	                size--;
//	                writer.append(""+al1.get(size));
//	                writer.append('\n');
//	            }
//	            writer.flush();
//	            writer.close();
//	        }
//	        catch(IOException e)
//	        {
//	            e.printStackTrace();
//	        }
   }
}
